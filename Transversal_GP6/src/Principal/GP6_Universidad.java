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
            
            //Alumno martin = new Alumno(45267558, "Martin", LocalDate.of(2003, 9, 3), true);
            //alu.guardarAlumno(martin);
            System.out.println(alu.buscarAlumno(19));   
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        } catch (ClassNotFoundException cargar) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver" + cargar.getMessage());
        }
    }
}
