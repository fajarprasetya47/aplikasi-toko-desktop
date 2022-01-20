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
public class modelKasir {
    private String namaPembeli;
    private String jumlahBarang;
    private String totalBelanja;
    
    connectDatabase koneksi = new connectDatabase();

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(String jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public String getTotalBelanja() {
        return totalBelanja;
    }

    public void setTotalBelanja(String totalBelanja) {
        this.totalBelanja = totalBelanja;
    }
    
    public void simpanDataTransaksi(){
        String sql = "INSERT INTO transaksi (namaPembeli, jmlBarang, total)"
                + " VALUES ('"+getNamaPembeli()+"','"+getJumlahBarang()+"'"
                + ",'"+getTotalBelanja()+"')";
        
        try {
            //inisialisasi preparedStatement
            PreparedStatement eksekusi = koneksi.getConnect().prepareStatement(sql);
            eksekusi.execute();
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            
        } catch (SQLException ex) {
            Logger.getLogger(modelKasir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan\n"+ex);            
        }
    }
}
