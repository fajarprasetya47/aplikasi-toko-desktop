/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import toko_database.connectDatabase;

/**
 *
 * @author Prasetya
 */

public class modelSignup {
    private String username;
    private String password;
    private String level;
    
    connectDatabase koneksi = new connectDatabase();

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
    
    public void daftarAkun(){
        String sql = "INSERT INTO user (username, password, level) VALUES "
                + "('"+getUsername()+"', '"+getPassword()+"', '"+getLevel()+"')";
        try {
            //inisialisasi preparedStatement
            PreparedStatement eksekusi = koneksi.getConnect().prepareStatement(sql);
            eksekusi.execute();
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Signup Berhasil");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Signup Gagal\n"+ex);            
        }
    }
}
