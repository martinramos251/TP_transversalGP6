package Principal;

import Entidades.Alumno;
import Persistencia.AlumnoData;
import Persistencia.MiConexion;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class GP6_Universidad {

    public static void main(String[] args) {
        try{
            
            MiConexion conexion = new MiConexion(); //Instanciar objeto MiConexion para usarlo en el metodo de AlumnoData
            AlumnoData alu = new AlumnoData(conexion); //Se instancia un objeto AlumnoData que inicializa el metodo buscarConexion
            
            Alumno luciano = new Alumno(42239994, "Luciano", LocalDate.of(1999, 11, 21), true);
            Alumno Luciano = null;
            alu.guardarAlumno(luciano);
            System.out.println(alu.buscarAlumno(8));
            
              Alumno enzo = new Alumno(44954914, "Enzo", LocalDate.of(2003, 9, 2), true);
            Alumno Enzo = null;
            alu.guardarAlumno(enzo);
                        System.out.println(alu.buscarAlumno(9));

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        } catch (ClassNotFoundException cargar) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver" + cargar.getMessage());
        }
    }
}
