/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_controller;

import toko_model.modelBarang;
import toko_view.viewBarang;

/**
 *
 * @author Prasetya
 */
public class controllerBarang {
    private modelBarang mB;
    private viewBarang vB;
    
    public controllerBarang(viewBarang vB){
        this.vB = vB;
    }
    
    public void deleteForm(){
       vB.getIdBarang().setText("");
       vB.getNamaBarang().setText("");
       vB.getKategori().setSelectedItem("");
       vB.getModal().setText("");
       vB.getHargaJual().setText("");
       vB.getStok().setValue(0);
    }
    
    public void controlButton(){
        vB.getTombolTambah().setEnabled(true);
        vB.getTombolEdit().setEnabled(false);
        vB.getTombolHapus().setEnabled(false);
        vB.getTombolBatal().setEnabled(true);
    }
    
    public void controlButton2(){
        vB.getTombolTambah().setEnabled(false);
        vB.getTombolEdit().setEnabled(true);
        vB.getTombolHapus().setEnabled(true);
        vB.getTombolBatal().setEnabled(true);
    }
    
    public void simpanData(){
        mB = new modelBarang();
        mB.setNamaBarang(vB.getNamaBarang().getText());
        mB.setKategori(vB.getKategori().getSelectedItem().toString());
        mB.setModal(vB.getModal().getText());
        mB.setHargaJual(vB.getHargaJual().getText());
        mB.setStok(Integer.parseInt(vB.getStok().getValue().toString()));
        
        mB.simpanDataBarang();
        deleteForm();
    }
    
    public void ubahData(){
        mB = new modelBarang();
        mB.setIdBarang(vB.getIdBarang().getText());
        mB.setNamaBarang(vB.getNamaBarang().getText());
        mB.setKategori(vB.getKategori().getSelectedItem().toString());
        mB.setModal(vB.getModal().getText());
        mB.setHargaJual(vB.getHargaJual().getText());
        mB.setStok(Integer.parseInt(vB.getStok().getValue().toString()));
        
        mB.ubahDataBarang();
        deleteForm();
        controlButton();
    }
    
    public void hapusData(){
        mB = new modelBarang();
        mB.setIdBarang(vB.getIdBarang().getText());
        
        mB.hapusDataBarang();
        deleteForm();
        controlButton();
    }
}
