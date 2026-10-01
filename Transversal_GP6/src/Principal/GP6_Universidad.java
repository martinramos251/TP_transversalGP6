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
            
//            Alumno alumno = new Alumno(473188, "Roman Castro", LocalDate.of(2006, 6, 29), true);
//            alu.guardarAlumno(alumno);
              Alumno alumnoConsulta = new Alumno();
              //alumnoConsulta = alu.buscarAlumno(15);
              System.out.println(alu.buscarAlumno(15));   
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        } catch (ClassNotFoundException cargar) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver" + cargar.getMessage());
        }
    }
}
