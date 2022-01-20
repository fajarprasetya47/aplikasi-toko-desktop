/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_controller;

import toko_model.modelUser;
import toko_view.viewUser;

/**
 *
 * @author Prasetya
 */
public class controllerUser {
    private viewUser vU;
    private modelUser mU;
    
    public controllerUser(viewUser vU){
        this.vU = vU;
    }
    
    public void editUser(){
        mU = new modelUser();
        mU.setIdUser(vU.getIdUser().getText());
        mU.setUsername(vU.getUsername().getText());
        mU.setPassword(vU.getPassword().getText());
        mU.setLevel(vU.getLevel().getSelectedItem().toString());
        
        mU.ubahDataUser();
        deleteForm();
    }
    
    public void deleteUser(){
        mU = new modelUser();
        mU.setIdUser(vU.getIdUser().getText());
        
        mU.hapusDataUser();
        deleteForm();
    }
    
    public void deleteForm(){
        vU.getIdUser().setText("");
        vU.getUsername().setText("");
        vU.getPassword().setText("");
        vU.getLevel().setSelectedItem("");
    }
    
    public void controlButton1(){
        vU.getTombolEdit().setEnabled(true);
        vU.getTombolDelete().setEnabled(true);
    }
    
    public void controlButton2(){
        vU.getTombolEdit().setEnabled(false);
        vU.getTombolDelete().setEnabled(false);
    }
}
