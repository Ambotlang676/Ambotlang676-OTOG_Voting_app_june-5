package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Config.Database;

public class user {
    
    private final String table_name = "user";
    private int role;
    
    public int Login(String un, String pw){
        Database db = new Database();
        
        try {
            
            PreparedStatement pst = db.DBConnect().prepareStatement("SELECT * FROM "+ this.table_name +" WHERE student_name=? AND password=?");
            pst.setString(1, un);
            pst.setString(2, pw);
            
             ResultSet rs = pst.executeQuery();
             
             if (rs.next()){
                 
                 switch (rs.getString("status")){
                     case "active" :  //active account
                         String role = rs.getString("role_id");
                         switch (role) {
                             case "1" :
                                 this.role = 1; // admin
                                 break;
                             case "2" :
                                 this.role = 2; // user
                                 break;
                         }
                     break;
                     case "iac" :
                         this.role = 3; //inactive
                         break;
                 }
             }else {
                 this.role = 4; //No user
             }
            
        }catch(Exception e ){
            this.role = 0;
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, e);
        }
        db.DBDisconnect();
        return this.role;
    }
    
}
