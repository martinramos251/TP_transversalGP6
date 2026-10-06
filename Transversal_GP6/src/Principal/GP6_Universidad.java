package Principal;

import Entidades.Alumno;
import Persistencia.AlumnoData;
import Persistencia.MiConexion;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class GP6_Universidad {

    public static void main(String[] args) {
        try {

            MiConexion conexion = new MiConexion(); //Instanciar objeto MiConexion para usarlo en el metodo de AlumnoData
            AlumnoData alu = new AlumnoData(conexion); //Se instancia un objeto AlumnoData que inicializa el metodo buscarConexion

            Alumno luciano = new Alumno(42239994, "Luciano", LocalDate.of(1999, 11, 21), true);
//            Alumno Luciano = null;
//            alu.guardarAlumno(luciano);
            System.out.println(alu.buscarAlumno(4));
            
            Alumno franco = new Alumno(37640491, "Franco", LocalDate.of(1999, 11, 15), true);
             //alu.guardarAlumno(franco);

            alu.altaBajaLogica(4, true);
            //alu.altaBajaLogica(1, false);
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        } catch (ClassNotFoundException cargar) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver" + cargar.getMessage());
        }
    }
}
