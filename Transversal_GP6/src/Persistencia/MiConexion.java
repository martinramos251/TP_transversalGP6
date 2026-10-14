package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MiConexion {

    private static Connection connection;
    private static final String URL = "jdbc:mariadb://localhost:3306/grupo_6_universidad";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    public MiConexion() {
    }

    public static Connection getConnection() {
                Connection con = null;
//
//        if (con == null) {
//            con = new Connection("jdbc:mysql://localhost/universidadg10", "root", "");
//        }
//
//        try {
//
//            con = DriverManager.getConnection(
//                    DATABASE_URL
//                    + DATABASE_HOST
//                    + DATABASE_PUERTO
//                    + DATABASE_DB
//                    + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
//                    + "&user="
//                    + DATABASE_USUARIO
//                    + "&password="
//                    + DATABASE_PASSWORD
//            );
//
//        } catch (SQLException ex) {
//            System.out.println("Error de conexion");
//        }
//        return connection;
//    }
        return connection;
    }

    public static void setConnection(Connection connection) {
        MiConexion.connection = connection;
    }

    //Permite establecer la conexion con la base de datos
    public static Connection buscarConexion() throws SQLException, ClassNotFoundException {
        if (connection == null) {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        }
        return connection;
    }
}
