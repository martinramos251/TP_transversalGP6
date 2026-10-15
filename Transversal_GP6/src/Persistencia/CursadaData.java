package Persistencia;

import Entidades.Alumno;
import Entidades.Cursada;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CursadaData {

    private Connection conect;

    public CursadaData() throws SQLException, ClassNotFoundException {
        conect = MiConexion.buscarConexion();
    }

    //Inscribe un alumno a una materia
    public void inscribirAlumnoMateria(Cursada c) {
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
    public List<Cursada> listarInscripciones() throws SQLException, ClassNotFoundException {
        Cursada c = null;
        Alumno a = null;
        Materia m = null;
        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        ArrayList<Cursada> listaCursada = new ArrayList<>();
        String sql = "SELECT * FROM cursada";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c = new Cursada();
                c.setIdCursada(rs.getInt(1));

                c.setAlumno(ad.buscarAlumno(rs.getInt(2)));
                c.setMateria(md.buscarMateria(rs.getInt(3)));
                c.setNota(rs.getFloat("nota"));

                listaCursada.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta");
        }
        return listaCursada;
    }

    //Obtener las materias en las que un alumno SI esta inscripto.
    public List<String> siInscripto(int dni) throws SQLException, ClassNotFoundException {
        List<Cursada> listaInscripto = listarInscripciones();
        List<String> materiasInscriptas = new ArrayList<>();
        for (Cursada c : listaInscripto) {
            if (c.getAlumno().getDni() == dni) {
                materiasInscriptas.add(c.getMateria().getNombre());
            }

        }
        return materiasInscriptas;

    }
    //Obtener las materias en las que un alumno NO esta inscripto.
    //Borrar la inscripcion de un alumno.
    //Actualizar a la ultima nota de cursada (obtener).
    //Mostrar historial de notas de la cursada, de una materia en especifico.
    //Obtener las inscripciones de los alumnos a una sola materia.
}
