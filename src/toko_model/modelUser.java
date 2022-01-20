/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import toko_database.connectDatabase;

/**
 *
 * @author Prasetya
 */
public class modelUser {
    private String idUser;
    private String username;
    private String password;
    private String level;
    
    connectDatabase koneksi = new connectDatabase();

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    public void ubahDataUser(){
        //inisialisasi query untuk update kedalam database
        String sql = "UPDATE user SET username = '"+getUsername()+"'"
                + ", password = '"+getPassword()+"'"
                + ", level = '"+getLevel()+"' WHERE idUser = '"+getIdUser()+"'";
        try {
            //inisialisasi preparedStatement
            PreparedStatement eksekusi = koneksi.getConnect().prepareStatement(sql);
            eksekusi.execute();
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            
        } catch (SQLException ex) {
            Logger.getLogger(modelUser.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah\n"+ex);            
        }
        
    }
    
    public void hapusDataUser(){
        //inisialisasi query untuk update kedalam database
        String sql = "DELETE FROM user WHERE idUser = '"+getIdUser()+"'";
        try {
            //inisialisasi preparedStatement
            PreparedStatement eksekusi = koneksi.getConnect().prepareStatement(sql);
            eksekusi.execute();
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            
        } catch (SQLException ex) {
            Logger.getLogger(modelUser.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus\n"+ex);            
        }
    }
}
