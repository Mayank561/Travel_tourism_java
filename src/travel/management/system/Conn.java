package travel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            // Update the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem", "root", "mayank");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
