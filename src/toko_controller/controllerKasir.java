/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_controller;

import javax.swing.table.DefaultTableModel;
import toko_model.modelKasir;
import toko_view.viewKasir;

/**
 *
 * @author Prasetya
 */
public class controllerKasir {
    private modelKasir mK;
    private viewKasir vK;
    
    public controllerKasir(viewKasir vK){
        this.vK = vK;
    }
    
    public void simpanTransaksi(){
        mK = new modelKasir();
        mK.setNamaPembeli(vK.getNamaPembeli().getText());
        mK.setJumlahBarang(vK.getJumlahBarang().getText());
        mK.setTotalBelanja(vK.getTotal().getText());
        
        mK.simpanDataTransaksi();
    }
    
    public void bayar(){
        int total = Integer.parseInt(vK.getTotal().getText());
        int bayar = Integer.parseInt(vK.getBayar().getText());
        
        int kembali = bayar - total;
        vK.getKembali().setText(String.valueOf(kembali));
    }
    
    public void resetForm(){
        vK.getNamaBarang().setText("");
        vK.getHargaBarang().setText("");
        vK.getJmlBeli().setValue(1);
        vK.getLabelTotalHarga().setText("0");
        vK.getNamaPembeli().setText("");
        vK.getTotal().setText("0");
        vK.getJumlahBarang().setText("");
        vK.getBayar().setText("");
        vK.getKembali().setText("");
        
        DefaultTableModel model = (DefaultTableModel) vK.getTabelKasir().getModel();
        model.setRowCount(0);
    }
    
    public void controlButtonBayar(){
        vK.getTombolSelesai().setEnabled(false);
        vK.getTombolBayar().setEnabled(true);
        vK.getTombolBatalTransaksi().setEnabled(true);
        vK.getTombolTambahBarang().setEnabled(true);
    }
    
    public void controlButtonSelesai(){
        vK.getTombolSelesai().setEnabled(true);
        vK.getTombolBayar().setEnabled(false);
        vK.getTombolBatalTransaksi().setEnabled(false);
        vK.getTombolTambahBarang().setEnabled(false);
    }
}
