package Persistencia;

import java.sql.Connection;
import java.sql.SQLException;

public class CursadaData {
    private Connection conect;

    public CursadaData() throws SQLException, ClassNotFoundException {
        conect = MiConexion.buscarConexion();
    }
    
    //Inscribe un alumno a una materia
    public void inscribirAlumnoMateria(){
        String sql = "INSERT INTO alumno (idCursada, idAlumno, idMateria, nota) VALUES (?,?,?,?)";
    
    }
    
    //Obtener inscripciones de todos los alumnos.
    //Obtener inscripcion registradas de un alumno en el cuatrimestre y en el anio.
    //Obtener las materias en las que un alumno SI esta inscripto.
    //Obtener las materias en las que un alumno NO esta inscripto.
    //Borrar la inscripcion de un alumno.
    //Actualizar a la ultima nota de cursada (obtener).
    //Obtener las inscripciones de los alumnos a una sola materia.
}
