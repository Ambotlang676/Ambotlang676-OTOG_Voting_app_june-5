package Model;

import Config.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class candidates {
    private final String table_name = "party_lists";
    
    public int upsert(String id, String party_lists, String pres, String vPres, String sec, String tre, String aud) {
        try{
            Database db = new Database();
            if(id == null || id.trim().isEmpty()){
                //insert
                PreparedStatement pst = db.DBConnect().prepareStatement("INSERT INTO "+this.table_name+" (party_lists, president, `vice president`, secretary, treasurer, auditor) VALUES (?, ?, ?, ?, ?, ?)");
                pst.setString(1, party_lists);
                pst.setString(2, pres);
                pst.setString(3, vPres);
                pst.setString(4, sec);
                pst.setString(5, tre);
                pst.setString(6, aud);
                pst.execute();
                
                db.DBDisconnect();
                return 1;
            }else {
                //update
                PreparedStatement pst = db.DBConnect().prepareStatement("UPDATE "+this.table_name+" SET party_lists = ? , president = ? , `vice president` = ? , secretary = ? ,treasurer = ? , auditor = ? WHERE id = ?");
                pst.setString(1, party_lists);
                pst.setString(2, pres);
                pst.setString(3, vPres);
                pst.setString(4, sec);
                pst.setString(5, tre);
                pst.setString(6, aud);
                pst.setInt(7, Integer.parseInt(id));
                pst.execute();
                
                db.DBDisconnect();
                return 2;
            }
        }catch(SQLException | NumberFormatException ex){
            System.out.print("Error Message: " + ex.getMessage());
            return 0;
        }
    }

    public int upsert(String text, String text0, String text1, String text2, String text3, String text4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int insertPartyList(String text, String text0, String text1, String text2, String text3, String text4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
