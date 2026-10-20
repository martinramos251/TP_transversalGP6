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
    public List<Materia> siInscripto(int dni) throws SQLException, ClassNotFoundException {
        List<Cursada> listaInscripto = listarInscripciones();
        List<Materia> materiasInscriptas = new ArrayList<>();
        for (Cursada c : listaInscripto) {
            if (c.getAlumno().getDni() == dni) {
                materiasInscriptas.add(c.getMateria());
            }
        }
        return materiasInscriptas;
    }

    //Obtener las materias en las que un alumno NO esta inscripto.
    public List<Materia> noInscripto(int dni) throws SQLException, ClassNotFoundException {
        MateriaData md = new MateriaData();
        List<Materia> materiasInscriptas = siInscripto(dni);
        List<Materia> totalMaterias = md.listarMaterias();
        List<Materia> materiasNoInscriptas = new ArrayList<>();

        for (Materia m : totalMaterias) {
            if (!materiasInscriptas.contains(m)) {
                materiasNoInscriptas.add(m);
            }
        }
        return materiasNoInscriptas;
    }

    //Borrar la inscripcion de un alumno.
    public void borrarInscripcion(int dni, String nombreMateria) throws SQLException, ClassNotFoundException {

        AlumnoData ad = new AlumnoData();
        Alumno a = ad.buscarAlumnoDni(dni);

        MateriaData md = new MateriaData();
        Materia m = md.buscarMateriaNombre(nombreMateria);

        String sql = "DELETE FROM cursada WHERE idMateria = ? AND idAlumno = ?";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, m.getIdMateria());
            ps.setInt(2, a.getIdAlumno());

            ps.executeUpdate();

            System.out.println("Cursada/inscripcion eliminada correctamente");
        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar la cursada/inscripcion");
        }

    }

    public void borrarInscripcion(String nombreMateria) throws SQLException, ClassNotFoundException {
        MateriaData md = new MateriaData();
        Materia m = md.buscarMateriaNombre(nombreMateria);

        String sql = "DELETE FROM cursada WHERE idMateria = ?";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, m.getIdMateria());
            ps.executeUpdate();

            System.out.println("Cursada/inscripcion eliminada correctamente");
        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar la cursada/inscripcion");
        }

    }

    //Obtener las inscripciones de los alumnos a una sola materia.
    public List<Cursada> inscripcionesMateria(String nombreMateria) throws SQLException, ClassNotFoundException {
        List<Cursada> totalIscripciones = listarInscripciones();
        List<Cursada> inscriptosMateria = new ArrayList<>();
        MateriaData md = new MateriaData();
        Materia m = md.buscarMateriaNombre(nombreMateria);

        for (Cursada c : totalIscripciones) {
            if (c.getMateria().getIdMateria() == m.getIdMateria()) {
                inscriptosMateria.add(c);
            }
        }

        return inscriptosMateria;
    }
}
