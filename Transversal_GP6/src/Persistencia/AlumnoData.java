package Persistencia;

import Entidades.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
        String query = "SELECT * FROM alumno";  // 1
        try(PreparedStatement ps = conect.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();  //3
            while(rs.next()){     //4
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));
            //    listado.add(alumno);    // agregar al ARRAYLIST
            }
            
        } catch (SQLException ex) {
            
        }
        return listado;
    }
}
   /* 
    public void actualizarAlumno(Alumno a){
        String query = "UPDATE ..........................................";  //1
        
        try {
           // PreparedStatement ps = ........................(query); //2
            //setString(1, a.getNombre());
            //setInt(2, .......);
            ps.setDate(... , Date.valueOf(a.getFecNac()));
            ps.setBoolean(... , a.getActivo());
            //................(5, a.getId());
            ps.executeUpdate();     // 3
                       
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }  // UPDATE SET 
    
    public void borrarAlumno(int id){
            
        String query = "DELETE FROM.........................";  //1
        
        try {
            PreparedStatement ps = con.prepareStatement(query); //2
            //setInt(... , id);
            ps.executeUpdate();     // 3
            
            ps.close();  // 4
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }// UPDATE SET / DELETE
}
*/
