package Principal;

import Entidades.Alumno;
import Entidades.Cursada;
import Entidades.Materia;
import Persistencia.AlumnoData;
import Persistencia.CursadaData;
import Persistencia.MateriaData;
import Persistencia.MiConexion;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class GP6_Universidad {

    public static void main(String[] args) {
        try {

            MiConexion conexion = new MiConexion(); //Instanciar objeto MiConexion para usarlo en el metodo de AlumnoData
            AlumnoData ad = new AlumnoData(); //Se instancia un objeto AlumnoData que inicializa el metodo buscarConexion
            MateriaData md = new MateriaData(); //Se instancia un objeto MateriaData que inicializa el metodo buscarConexion
            CursadaData cd = new CursadaData(); //Se instancia un objeto CursadaData que inicializa el metodo buscarConexion

            /* CARGA DE ALUMNOS */
//            Alumno luciano = new Alumno(42239994, "Luciano", LocalDate.of(1999, 11, 21), true);
//            Alumno luciano = alu.buscarAlumno(21); 
//            alu.guardarAlumno(luciano);
//            luciano.setIdAlumno(alu.buscarAlumno(21).getIdAlumno());
//
//            Alumno franco = new Alumno(37640491, "Franco", LocalDate.of(1999, 11, 15), true);
//            alu.guardarAlumno(franco);
//
//            Alumno enzo = new Alumno(44954914, "Enzo", LocalDate.of(2003, 9, 2), true);
//            alu.guardarAlumno(enzo);
//           
//            Alumno martin = new Alumno(45267558, "Martin", LocalDate.of(2003, 9, 3), true);
//            alu.guardarAlumno(martin);   
//            
//            Alumno roman = new Alumno(47318814, "Roman", LocalDate.of(2006, 6, 29), true);
//            alu.guardarAlumno(roman);
//            
//            Alumno cami = new Alumno(42220747, "Cami", LocalDate.of(1999, 11, 10), true);
//            alu.guardarAlumno(cami);

            /* CARGA DE MATERIAS */
//            Materia mat = new Materia("Lengua", true);
//            Materia mat2 = new Materia("Matematicas", true);
//           Materia mat3 = new Materia("Lab Programacion", true);
//            Materia mat4 = new Materia("Programacion Web I", true);
//            Materia mat5 = new Materia("Redes", true);
//            Materia mat6 = new Materia("Base de Datos", true);
//            md.guardarMateria(mat);
//            md.guardarMateria(mat2);
//            md.guardarMateria(mat3);
//            md.guardarMateria(mat4);
//            md.guardarMateria(mat5);
//            md.guardarMateria(mat6);
//           Materia lenguaId = md.buscarMateria(2);
//            lengua.setIdMateria(md.buscarMateria(2).getIdMateria());
//          Dar de alta o baja
//         alu.altaBajaLogica(18, false);
//          PRUEBA DE METODOS DE MATERIADATA
//          Materia fisica = md.buscarMateria(2);
//          fisica.setNombre("Fisica");
//          md.guardarMateria(matematicas);
//           md.actualizarMateria(fisica);
//            md.borrarMateria(2);
//            md.altaBajaLogica(1, false);
//           System.out.println(md.listarMaterias());
//           Cursada cursa = new Cursada(alu.buscarAlumno(4), md.buscarMateria(1), 7);
//            cd.inscribirAlumnoMateria(cursa);
//
           //System.out.println(cd.listarInscripciones());
            System.out.println(alu.listarAlumnos());

        } catch (ClassNotFoundException cnf) {
            JOptionPane.showMessageDialog(null, "Error al cargar los drivers", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error al establecer la conexion con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
