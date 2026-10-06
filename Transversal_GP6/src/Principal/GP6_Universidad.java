package Principal;

import Entidades.Alumno;
import Entidades.Materia;
import Persistencia.AlumnoData;
import Persistencia.MateriaData;
import Persistencia.MiConexion;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class GP6_Universidad {

    public static void main(String[] args) {
        try {

            MiConexion conexion = new MiConexion(); //Instanciar objeto MiConexion para usarlo en el metodo de AlumnoData
            AlumnoData alu = new AlumnoData(conexion); //Se instancia un objeto AlumnoData que inicializa el metodo buscarConexion
            MateriaData md = new MateriaData(conexion);

            /* CARGA DE ALUMNOS */
//            Alumno luciano = new Alumno(42239994, "Luciano", LocalDate.of(1999, 11, 21), true);
//            alu.guardarAlumno(luciano);
//
//            Alumno franco = new Alumno(37640491, "Franco", LocalDate.of(1999, 11, 15), true);
//           alu.guardarAlumno(franco);
//
//            Alumno enzo = new Alumno(44954914, "Enzo", LocalDate.of(2003, 9, 2), true);
//            alu.guardarAlumno(enzo);
//            
//            Alumno martin = new Alumno(45267558, "Martin", LocalDate.of(2003, 9, 3), true);
//            alu.guardarAlumno(martin);   
//            
//            Alumno roman = new Alumno(47318814, "Roman", LocalDate.of(2006, 6, 29), true);
//            alu.guardarAlumno(roman);
//            Alumno cami = new Alumno(42220747, "Cami", LocalDate.of(1999, 11, 10), true);
//            alu.guardarAlumno(cami);

            /* CARGA DE MATERIAS */
            Materia matematica = new Materia("Matemáticas", true);
            md.guardarMateria(matematica);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        } catch (ClassNotFoundException cargar) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver" + cargar.getMessage());
        }
    }
}
