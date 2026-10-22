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

    /**
     * Inscribe un alumno a una materia, verifica que no este repetida la inscripcion.
     * @param c
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void inscribirAlumnoMateria(Cursada c) throws SQLException, ClassNotFoundException {
        List<Cursada> allCursada = listarInscripciones();
        
        //llamamos a verificarInscripcion para saber si el alumno esta inscripto a la materia 
        //luego verificamos si devuelve algo es por que ya esta inscripto por eso comparamos 
        if(!verificarInscripcion(c.getAlumno().getIdAlumno(),c.getMateria().getIdMateria())){
            
            
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
                System.out.println("Inscripcion guardada!");
            } catch (SQLException ex) {
                System.out.println("No se pudo insertar");
            }
        }
        else{
                System.out.println("No se pudo insertar por que ya esta inscripto ");
        }
    }
    public boolean verificarInscripcion(int idAlumno, int idMateria){
        boolean res = false;
        String sql = "SELECT * FROM cursada WHERE idAlumno = ? AND idMateria = ?";

        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ResultSet rs = ps.executeQuery();
            
            res = rs.next();
            
        } catch (SQLException ex) {
            System.out.println("No se pudo hacer la consulta");
        }
        return res;
    }

    /**
     * Obtener inscripciones de todos los alumnos.
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
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

    /**
     * Obtener las materias en las que un alumno SI esta inscripto.
     * @param dni
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
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

    /**
     * Obtener las materias en las que un alumno NO esta inscripto.
     * @param dni
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public List<Materia> noInscripto(int dni) throws SQLException, ClassNotFoundException {
        MateriaData md = new MateriaData();
        List<Materia> materiasInscriptas = siInscripto(dni);
        List<Materia> totalMaterias = md.listarMateriasAlta();
        List<Materia> materiasNoInscriptas = new ArrayList<>();

        for (Materia m : totalMaterias) {
            if (!materiasInscriptas.contains(m)) {
                materiasNoInscriptas.add(m);
            }
        }
        return materiasNoInscriptas;
    }

    /**
     * Borrar la inscripcion de un alumno por id de la base de datos.
     * @param idAlumno
     * @param idMateria
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void borrarInscripcion(int idAlumno, int idMateria) throws SQLException, ClassNotFoundException {

        AlumnoData ad = new AlumnoData();
        Alumno a = ad.buscarAlumno(idAlumno);

        MateriaData md = new MateriaData();
        Materia m = md.buscarMateria(idMateria);

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
    
    /**
     * Permite borrar la inscripcion de un alumno a traves del nombre de la materia.
     * @param nombreMateria
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
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

    /**
     * Borrar inscripción de un alumno por su id.
     * @param idAlumno
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void borrarInscripcion(int idAlumno) throws SQLException, ClassNotFoundException {
        AlumnoData ad = new AlumnoData();
        Alumno a = ad.buscarAlumno(idAlumno);

        String sql = "DELETE FROM cursada WHERE idAlumno = ?";
        try (PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, a.getIdAlumno());
            ps.executeUpdate();

            System.out.println("Cursada/inscripcion eliminada correctamente");
        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar la cursada/inscripcion");
        }
    }

    /**
     * Obtener todas las inscripciones de los alumnos a una sola materia (por nombre de la materia).
     * @param nombreMateria
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public List<Cursada> inscripcionesMateria(String nombreMateria) throws SQLException, ClassNotFoundException {
        List<Cursada> totalInscripciones = listarInscripciones();
        List<Cursada> inscriptosMateria = new ArrayList<>();
        MateriaData md = new MateriaData();
        Materia m = md.buscarMateriaNombre(nombreMateria);

        for (Cursada c : totalInscripciones) {
            if (c.getMateria().getIdMateria() == m.getIdMateria()) {
                inscriptosMateria.add(c);
            }
        }
        return inscriptosMateria;
    }
    
    /**
     * Obtener todas las inscripciones en las que esta anotado un alumno especifico (por nombre del alumno).
     * @param nombreAlumno
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public List<Cursada> inscripcionesAlumno(String nombreAlumno) throws SQLException, ClassNotFoundException {
        List<Cursada> totalInscripciones = listarInscripciones();
        List<Cursada> inscriptosAlumno = new ArrayList<>();

        for (Cursada c : totalInscripciones) {
            if (c.getAlumno() != null && c.getAlumno().getNombre().equalsIgnoreCase(nombreAlumno)) {
                inscriptosAlumno.add(c);
            }
        } 
        return inscriptosAlumno;
    }
    
    /**
     * Permite actualizar la nota de una cursada (por el id de la cursada).
     * @param idCursada
     * @param nota 
     */
    public void actualizarNota(int idCursada, float nota) {
    String sql = "UPDATE cursada SET nota = ? WHERE idCursada = ?";
    try (PreparedStatement ps = conect.prepareStatement(sql)) {
        ps.setFloat(1, nota);
        ps.setInt(2, idCursada);
        ps.executeUpdate();
        System.out.println("Nota actualizada correctamente!");
    } catch (SQLException ex) {
        System.out.println("No se pudo actualizar la nota");
    }
}
}
