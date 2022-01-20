/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_controller;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.mainAppAdm;
import main.mainApp;
import toko_database.connectDatabase;
import toko_view.viewLogin;

/**
 *
 * @author Prasetya
 */
public class controllerLogin {
    private viewLogin vL;
    
    public controllerLogin(viewLogin vL){
        this.vL = vL;
    }
    
    public void loginAdmin(){
        String sql = "SELECT * FROM user WHERE username='"+vL.getUsername().getText()+"' AND "
                + "password='"+vL.getPassword().getText()+"' AND level='admin'";
        try {
            Statement stat = (Statement) connectDatabase.getConnect().createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            if (res.first()){
                JOptionPane.showMessageDialog(null, "Login Sukses");
                vL.dispose();
                
                mainAppAdm main = new mainAppAdm();
                main.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Username atau Password Salah");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    
    public void loginKasir(){
        String sql = "SELECT * FROM user WHERE username='"+vL.getUsername().getText()+"' AND "
                + "password='"+vL.getPassword().getText()+"' AND level='kasir'";
        try {
            Statement stat = (Statement) connectDatabase.getConnect().createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            if (res.first()){
                JOptionPane.showMessageDialog(null, "Login Sukses");
                vL.dispose();
                
                mainApp main = new mainApp();
                main.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Username atau Password Salah");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
}
