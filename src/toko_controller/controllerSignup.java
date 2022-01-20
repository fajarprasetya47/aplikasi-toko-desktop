/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_controller;

import toko_model.modelSignup;
import toko_view.viewSignup;

/**
 *
 * @author Prasetya
 */
public class controllerSignup {
    private viewSignup vS;
    private modelSignup mS;
    
    public controllerSignup(viewSignup vS){
        this.vS = vS;
    }
    
    public void signup(){
        mS = new modelSignup();
        
        mS.setUsername(vS.getUsername().getText());
        mS.setPassword(vS.getPassword().getText());
        mS.setLevel(vS.getLevel().getSelectedItem().toString());
        
        mS.daftarAkun();
    }
}
