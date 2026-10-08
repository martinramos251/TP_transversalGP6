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

    private Connection conect = null;

    public MateriaData() {
    }

    public MateriaData(MiConexion conexion) throws SQLException, ClassNotFoundException {
        conect = conexion.buscarConexion();
    }

    public void guardarMateria(Materia m) {
        String sql = "INSERT INTO materia (nombre, estado) VALUES (?,?)";
        try (PreparedStatement ps = conect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, m.getNombre());
            ps.setBoolean(2, m.getEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                m.setIdMateria(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el ID");
            }

            System.out.println("Materia guardada!");
        } catch (SQLException ex) {
            System.out.println("No se pudo insertar");
        }
    }

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

    public void actualizarMateria(Materia m) {
        String sql = "UPDATE materia SET nombre = ?, estado = ?";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setString(1, m.getNombre());
            ps.setBoolean(2, m.getEstado());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se pudo actualizar la materia");
        }
    }

    public void borrarMateria(int idMateria) {

        String sql = "DELETE FROM materia WHERE idMateria = ?";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, idMateria);
            ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar la materia");
        }
    }

    public void altaBajaLogica(int idMateria, boolean estado) {
        Materia m = buscarMateria(idMateria); // Busco el alumno en la base
        m.setEstado(estado); // Modifico el estado (para darle alta o baja) dependiendo lo que reciba por parametro
        actualizarMateria(m); // Actualiza en la base el estado del alumno que acabo de modificar 
        System.out.println("Se actualizo el estado de la materia " + m.getNombre()+ " a " + m.getEstado());
    }
}
