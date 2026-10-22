package Persistencia;

import Entidades.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoData {
    private Connection conect;
    
    public AlumnoData() throws SQLException, ClassNotFoundException {
        conect = MiConexion.buscarConexion();
    }   
    
    /**
     * Permite guardar un alumno a la base de datos.
     * @param a 
     */
    public void guardarAlumno(Alumno a) {
        String sql = "INSERT INTO alumno (dni, nombre, fechaNac, activo) VALUES (?,?,?,?)";
        try (PreparedStatement ps = conect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, a.getDni()); //Carga del dni al alumno (posicion 1 del INSERT).
            ps.setString(2, a.getNombre()); //Carga del nombre al alumno (posicion 2 del INSERT).
            ps.setDate(3, Date.valueOf(a.getFechaNac())); //Carga la fecha al alumno (posicion 3 del INSERT).
            ps.setBoolean(4, a.getActivo()); //Carga el estado al alumno (posicion 4 del INSERT).
            ps.executeUpdate(); //Se ejecuta la consulta.

            ResultSet rs = ps.getGeneratedKeys(); //Recupero un alumno y le asigno el id (auto-incremental) al id de mi atributo Alumno
            if (rs.next()) {
                a.setIdAlumno(rs.getInt(1));
                System.out.println("Alumno guardado!");
            } else {
                System.out.println("No se pudo obtener el ID");
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo insertar el alumno");
        }
    }
    
    /**
     * Permite buscar un alumno por su id en la base de datos.
     * @param id
     * @return 
     */
    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE idAlumno = ?";

        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate()); // Date.valueOf( )
                alumno.setActivo(rs.getBoolean("activo"));
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo hacer la consulta");
        }
        return alumno;
    }
    
    /**
     * Permite buscar un alumno por su dni en la base de datos.
     * @param dni
     * @return 
     */
    public Alumno buscarAlumnoDni(int dni) {
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE dni = ?";

        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate()); // Date.valueOf( )
                alumno.setActivo(rs.getBoolean("activo"));
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo hacer la consulta");
        }
        return alumno;
    }
    
    /**
     * Trae a todos los alumnos de la base de datos.
     * @return 
     */
    public List<Alumno> listarAlumnos() {
        Alumno alumno = null;
        ArrayList<Alumno> listado = new ArrayList<>();
        String sql = "SELECT * FROM alumno";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();  
            while (rs.next()) {    
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));
                listado.add(alumno);  
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo listar los alumnos");
        }
        return listado;
    }
    
    /**
     * Trae a todos los alumnos que esten activos de la base de datos.
     * @return 
     */
    public List<Alumno> listarAlumnosAlta() {
        Alumno alumno = null;
        ArrayList<Alumno> listado = new ArrayList<>();
        String sql = "SELECT * FROM alumno WHERE activo = true";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));
                listado.add(alumno);
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo listar los alumnos");
        }
        return listado;
    }

    /**
     * Actualiza un atributo del alumno en la base de datos.
     * @param a 
     */
    public void actualizarAlumno(Alumno a) {
        String sql = "UPDATE alumno SET dni = ?, nombre = ?, fechaNac = ?, activo = ? WHERE idAlumno = ? "; 

        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, a.getDni());
            ps.setString(2, a.getNombre());
            ps.setDate(3, Date.valueOf(a.getFechaNac()));
            ps.setBoolean(4, a.getActivo());
            ps.setInt(5, a.getIdAlumno());
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("No se pudo actualizar el alumno");
        }
    }
    
    /**
     * Borra a un alumno por su id en la base de datos.
     * @param id 
     */
    public void borrarAlumno(int id) {
        String sql = "DELETE FROM alumno WHERE idAlumno = ?";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar el alumno");
        }
    }

    /**
     * Permite dar de baja o alta un alumno de la base de datos.
     * Cambiar su atributo (activo) a "true" o "false" (borrado logico).
     * @param id
     * @param status 
     */
    public void altaBajaLogica(int id, boolean status) {
        Alumno a = buscarAlumno(id); //Busco el alumno en la base.
        a.setActivo(status); //Modifico el activo (para darle alta o baja) dependiendo lo que reciba por parametro.
        actualizarAlumno(a); //Actualiza en la base el estado del alumno que acabo de modificar.
        System.out.println("Se actualizo el estado del alumno " + a.getNombre() + " a " + a.getActivo());
    }
}
