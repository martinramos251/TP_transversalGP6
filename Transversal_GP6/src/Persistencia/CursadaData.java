package Persistencia;

import Entidades.Cursada;
import java.sql.Connection;
import java.sql.*;

public class CursadaData {
    private Connection conect;

    public CursadaData() throws SQLException, ClassNotFoundException {
        conect = MiConexion.buscarConexion();
    }
    
    //Inscribe un alumno a una materia
    public void inscribirAlumnoMateria(Cursada c){
        String sql = "INSERT INTO cursada (idAlumno, idMateria, nota) VALUES (?,?,?)";
        try (PreparedStatement ps = conect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, c.getAlumno().getIdAlumno());
            ps.setInt(2, c.getMateria().getIdMateria());
            ps.setFloat(3, c.getNota());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                c.setIdCursada(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el ID");
            }
            System.out.println("Guardado!");
        } catch (SQLException ex) {
            System.out.println("No se pudo insertar");
        }
    
    }
    
    //Obtener inscripciones de todos los alumnos.
    //Obtener inscripcion registradas de un alumno en el cuatrimestre y en el anio.
    //Obtener las materias en las que un alumno SI esta inscripto.
    //Obtener las materias en las que un alumno NO esta inscripto.
    //Borrar la inscripcion de un alumno.
    //Actualizar a la ultima nota de cursada (obtener).
    //Mostrar historial de notas de la cursada, de una materia en especifico.
    //Obtener las inscripciones de los alumnos a una sola materia.
}
