/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_database;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Prasetya
 */

public class connectDatabase {
    private static Connection conn;
    
    public static Connection getConnect() throws SQLException{
        if(conn==null){
            try {
                String url = "jdbc:mysql://localhost:3306/dbtokodesktop";
                String username = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection(url, username, password);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Connect Database Gagal");
            }
        }
        return conn;
    }
    
//    public static void main(String[] args) throws SQLException {
//        getConnect();
//    }
}
