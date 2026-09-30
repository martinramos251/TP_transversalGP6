package Principal;

import Persistencia.AlumnoData;
import Persistencia.MiConexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GP6_Universidad {

    public static void main(String[] args) {
        try {
            MiConexion conect = new MiConexion(); //Instanciar objeto MiConexion para usarlo en el metodo de AlumnoData
            AlumnoData alu = new AlumnoData(conect); //Se instancia un objeto AlumnoData que inicializa el metodo buscarConexion
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        } catch (ClassNotFoundException cargar) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver" + cargar.getMessage());
        }
    }
}
