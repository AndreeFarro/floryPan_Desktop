package persistencia;

import java.sql.*;

public class Conexion {
    private static Connection connect;    
    public static Connection getInstance() {
        if (connect == null) {
            try {                             
                System.out.println("Conectando a la base de datos...");
                /*Class.forName("org.apache.derby.jdbc.ClientDriver");
                String myDb = "jdbc:derby://localhost:1527/arq_uni";
                connect = DriverManager.getConnection(myDb, "administrador","1234");
*/
                Class.forName("com.mysql.jdbc.Driver");
                connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/florypan","root","");
                System.out.println("Conectado");
                return connect;
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("Error: "+e);
            }
        }
        return connect;
    }
}
