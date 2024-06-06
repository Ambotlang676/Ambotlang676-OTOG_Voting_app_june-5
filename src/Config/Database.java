package Config;

//Data base Connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private final String username = "root";
    private final String password = "";
    private final String DbName = "voting_app";
    private final String URLConnection = "jdbc:mysql://localhost:3306/" + this.DbName;
    private Connection conn = null; 
    
    
    public Connection DBConnect() {
        try {
            this.conn = DriverManager.getConnection(this.URLConnection, this.username, this.password);
        } catch(SQLException ex) {
            System.out.println("SQL Exception: " + ex.getMessage());
        }
        return this.conn;
    }
    
    public void DBDisconnect() {
        try {
            if(this.conn != null && this.conn.isClosed()) {
                this.conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("SQL Exception: " + ex.getMessage());
        }
    }

}
