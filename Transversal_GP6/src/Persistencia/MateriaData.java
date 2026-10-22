package Persistencia;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MateriaData {
    private Connection conect;
    
    public MateriaData() throws SQLException, ClassNotFoundException {
        conect = MiConexion.buscarConexion();
    }
    
    /**
     * Permite guardar una materia a la base de datos.
     * @param m 
     */
    public void guardarMateria(Materia m) {
        String sql = "INSERT INTO materia (nombre, estado) VALUES (?,?)";
        try (PreparedStatement ps = conect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, m.getNombre());
            ps.setBoolean(2, m.getEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                m.setIdMateria(rs.getInt(1));
                System.out.println("Materia guardada!");
            } else {
                System.out.println("No se pudo obtener el ID");
            }

            System.out.println("Materia guardada!");
        } catch (SQLException ex) {
            System.out.println("No se pudo insertar la materia");
        }
    }
    
    /**
     * Permite buscar una materia por su id en la base de datos.
     * @param id
     * @return 
     */
    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE idMateria = ?";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(rs.getBoolean("estado"));
            }
        } catch (SQLException e) {
            System.out.println("No se pudo hacer la consulta");
        }
        return materia;
    }
    
    /**
     * Permite buscar una materia por su nombre en la base de datos.
     * @param nombre
     * @return 
     */
    public Materia buscarMateriaNombre(String nombre) {
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE nombre = ?";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(rs.getBoolean("estado"));
            }
        } catch (SQLException e) {
            System.out.println("No se pudo hacer la consulta");
        }
        return materia;
    }
    
    /**
     * Trae todas las materias de la base de datos.
     * @return 
     */
    public List<Materia> listarMaterias() {
        Materia materia = null;
        ArrayList<Materia> listaMateria = new ArrayList<>();
        String sql = "SELECT * FROM materia";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(rs.getBoolean("estado"));
                listaMateria.add(materia);
            }
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta");
        }
        return listaMateria;
    }
    
    /**
     * Trae todas las materias que esten activas de la base de datos.
     * @return 
     */
    public List<Materia> listarMateriasAlta() {
        Materia materia = null;
        ArrayList<Materia> listaMateria = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE estado = true";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(rs.getBoolean("estado"));
                listaMateria.add(materia);
            }
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta");
        }
        return listaMateria;
    }
    
    /**
     * Actualiza un atributo de la materia en la base de datos.
     * @param m 
     */
    public void actualizarMateria(Materia m) {
        String sql = "UPDATE materia SET nombre = ?, estado = ? WHERE idMateria = ?";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setString(1, m.getNombre());
            ps.setBoolean(2, m.getEstado());
            ps.setInt(3, m.getIdMateria());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se pudo actualizar la materia");
        }
    }
    
    /**
     * Permite borrar una materia de la base de datos.
     * @param idMateria 
     */
    public void borrarMateria(int idMateria) {
        String sql = "DELETE FROM materia WHERE idMateria = ?";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, idMateria);
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar la materia");
        }
    }
    
    /**
     * Permite dar de baja o alta una materia de la base de datos.
     * Cambiar su atributo (estado) a "true" o "false" (borrado logico).
     * @param idMateria
     * @param estado 
     */
    public void altaBajaLogica(int idMateria, boolean estado) {
        Materia m = buscarMateria(idMateria); //Busco una materia en la base.
        m.setEstado(estado); //Modifico el estado (para darle alta o baja) dependiendo lo que reciba por parametro.
        actualizarMateria(m); //Actualiza en la base el estado de la materia que acabo de modificar. 
        System.out.println("Se actualizo el estado de la materia " + m.getNombre() + " a " + m.getEstado());
    }
}
