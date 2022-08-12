
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionDB {

  

    
    Connection con = null;

    public Connection getConnection() {

        
        try {
            Class.forName("org.sqlite.JDBC");
             con = DriverManager.getConnection("jdbc:sqlite:Mahsul.db");
             System.out.println("Bağlantı BAŞARILI");
        }
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Bağlantı BAŞARISIZ... HATA: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Bağlantı BAŞARISIZ... HATA: " + ex.getMessage());

        }
        return con;
    }
}
