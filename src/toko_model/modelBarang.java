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
public class modelBarang {
    private String idBarang;
    private String namaBarang;
    private String kategori;
    private String modal;
    private String hargaJual;
    private int stok;
    
    connectDatabase conn = new connectDatabase();

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(String hargaJual) {
        this.hargaJual = hargaJual;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void simpanDataBarang(){
        //inisialisasi query untuk insert kedalam database
        String sql = ("INSERT INTO barang (namaBarang, kategori, modal, hargaJual, stok) "
                +" VALUES ('"+getNamaBarang()+"', '"+getKategori()+"' "
                + ", '"+getModal()+"', '"+getHargaJual()+"', '"+getStok()+"')");
        
        try {
            //inisialisasi preparedStatement
            PreparedStatement eksekusi = conn.getConnect().prepareStatement(sql);
            eksekusi.execute();
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            
        } catch (SQLException ex) {
            Logger.getLogger(modelBarang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan\n"+ex);            
        }
        
    }
    
    public void ubahDataBarang(){
        //inisialisasi query untuk update kedalam database
        String sql = "UPDATE barang SET namaBarang = '"+getNamaBarang()+"'"
                + ", kategori = '"+getKategori()+"'"
                + ", modal = '"+getModal()+"'"
                + ", hargaJual = '"+getHargaJual()+"'"
                + ", stok = '"+getStok()+"' WHERE idBarang = '"+getIdBarang()+"'";
        try {
            //inisialisasi preparedStatement
            PreparedStatement eksekusi = conn.getConnect().prepareStatement(sql);
            eksekusi.execute();
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            
        } catch (SQLException ex) {
            Logger.getLogger(modelBarang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah\n"+ex);            
        }
        
    }
    
    public void hapusDataBarang(){
        //inisialisasi query untuk update kedalam database
        String sql = "DELETE FROM barang WHERE idBarang = '"+getIdBarang()+"'";
        try {
            //inisialisasi preparedStatement
            PreparedStatement eksekusi = conn.getConnect().prepareStatement(sql);
            eksekusi.execute();
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            
        } catch (SQLException ex) {
            Logger.getLogger(modelBarang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus\n"+ex);            
        }
    }
}
