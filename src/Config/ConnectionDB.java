
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private final String url = "jdbc:postgresql://localhost/myDB";
    private String username = "postgres";
    private String password = "852906";
    
    public Connection getConnection() {
     
        try { 
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.getLogger(ConnectionDB.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return null;
       
    }
}
