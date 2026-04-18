import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/PruebaProgramacion", "root", "");
            System.out.println(connection.getCatalog());
        } catch (SQLException e) {
            System.out.println("Error en la conexion con la base de datos");
            System.out.println(e.getMessage());
        }



    }


}
