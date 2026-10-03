package Persistencia;

import Entidades.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlumnoData {

    private Connection conect = null;

    public AlumnoData(MiConexion conexion) throws SQLException, ClassNotFoundException {
        this.conect = conexion.buscarConexion();
    }

    public void guardarAlumno(Alumno a) { 
        String sql = "INSERT INTO alumno (dni, nombre, fechaNac, activo) VALUES (?,?,?,?)";
        try(PreparedStatement ps = conect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) { 
            ps.setInt(1, a.getDni()); //Carga del dni al alumno (posicion 1 del INSERT).
            ps.setString(2, a.getNombre()); //Carga del nombre al alumno (posicion 2 del INSERT).
            ps.setDate(3, Date.valueOf(a.getFechaNac())); //Carga la fecha al alumno (posicion 3 del INSERT).
            ps.setBoolean(4,a.getActivo()); //Carga el estado al alumno (posicion 4 del INSERT).
            ps.executeUpdate(); //Se ejecuta la consulta.
            
            ResultSet rs = ps.getGeneratedKeys(); //Recupero un alumno y le asigno el id (auto-incremental) al id de mi atributo Alumno
            if (rs.next()) {
                a.setIdAlumno(rs.getInt(1));
            } else {
                System.out.println("No se pudo tener ID");
            }
            System.out.println("Guardado!");
        } catch (SQLException ex) {
            System.out.println("No se pudo insertar");
        }
    }
    
    public Alumno buscarAlumno(int id){
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE idAlumno= ?";

        try(PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {  
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate()); // Date.valueOf( )
                alumno.setActivo(rs.getBoolean("activo"));
            }          
        }catch (SQLException ex) {
            System.out.println("No se pudo hacer la consulta");
        }
        return alumno;    
    }
     
    public List<Alumno> listarAlumnos(){
        Alumno alumno= null;
        ArrayList<Alumno> listado = new ArrayList<>();
        String sql = "SELECT * FROM alumno";  // 
        try(PreparedStatement ps = conect.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();  //3
            while(rs.next()){     //4
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));
                listado.add(alumno); //Agrega c/alumno al array 
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo listar los alumnos");
        }
        return listado;
    }

    public void actualizarAlumno(Alumno a){
        String sql = "UPDATE alumno SET dni = ?, nombre = ?, fechaNac = ?,activo = ?, WHERE idAlumno = ? ";  //1
        
        try (PreparedStatement ps = conect.prepareStatement(sql)){//2
            ResultSet rs = ps.executeQuery(); 
            ps.setInt(1, a.getDni()); 
            ps.setString(2, a.getNombre()); 
            ps.setDate(3, Date.valueOf(a.getFechaNac())); 
            ps.setInt(4, a.getIdAlumno()); 
            ps.setBoolean(5, a.getActivo());
            ps.executeUpdate(); 
            ps.close();     // 3
                                   
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex); //Registra el error que ocurrió en AlumnoData como un error grave. Null es porque no puimos un msje personalizado
        }           
        
    }
    
    public void borrarAlumno(int id){
            
        String sql = "DELETE FROM alumno WHERE idAlumno = ?";
        try (PreparedStatement ps = conect.prepareStatement(sql)){//2
            ps.setInt(1, id);
            ps.executeUpdate();     // 3
            ps.close();  // 4
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    // Este Metodo/Procedimiento lo hacemos asi para reutilizar codigo
    public void altaBajaLogica (int id, boolean activo) {
        Alumno a = buscarAlumno(id); // Busco el alumno en la base
        a.setActivo(activo); // Modifico el estado (para darle alta o baja) dependiendo lo que reciba por parametro
        actualizarAlumno(a); // Actualiza en la base el estado del alumno que acabo de modificar 
    }
}   


