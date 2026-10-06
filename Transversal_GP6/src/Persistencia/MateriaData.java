package Persistencia;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MateriaData {

    private Connection conect = null;

    public MateriaData(MiConexion conexion) throws SQLException, ClassNotFoundException {
        conect = conexion.buscarConexion();
    }

    public void guardarMateria(Materia m) {
        String sql = "INSERT INTO materia (nombre, estado) VALUES (?,?)";
        try (PreparedStatement ps = conect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, m.getNombre());
            ps.setBoolean(2, m.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                m.setIdMateria(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el ID");
            }

            System.out.println("Materia guardada!");
        } catch (Exception e) {
            System.out.println("No se pudo insertar");
        }
    }

}
