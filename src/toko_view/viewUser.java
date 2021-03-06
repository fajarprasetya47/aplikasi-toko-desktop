/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko_view;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import toko_controller.controllerUser;
import toko_database.connectDatabase;

/**
 *
 * @author Prasetya
 */
public class viewUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewUser
     */
    private DefaultTableModel model;
    private controllerUser cU;
    public viewUser() {
        initComponents();
        cU = new controllerUser(this);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        
        model = new DefaultTableModel();
        tabelUser.setModel(model);
        model.addColumn("ID");
        model.addColumn("USERNAME");
        model.addColumn("PASSWORD");
        model.addColumn("LEVEL");
        
        tampilDataUser();
        cU.controlButton2();
    }

    public JTextField getIdUser() {
        return idUser;
    }

    public JComboBox<String> getLevel() {
        return level;
    }

    public JTextField getPassword() {
        return password;
    }

    public JTextField getUsername() {
        return username;
    }

    public JButton getTombolCancel() {
        return tombolCancel;
    }

    public JButton getTombolDelete() {
        return tombolDelete;
    }

    public JButton getTombolEdit() {
        return tombolEdit;
    }
    
    private void tampilDataUser() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        String sql = "SELECT * FROM user";
        try {
            Statement stat = (Statement) connectDatabase.getConnect().createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            while(res.next()){
                //mengambil hasil query variable sql
                Object[] hasil;
                hasil = new Object[6]; // karena ada 6 field
                hasil[0] = res.getString("idUser");
                hasil[1] = res.getString("username");
                hasil[2] = res.getString("password");
                hasil[3] = res.getString("level");
                
                model.addRow(hasil);                  
            }
        } catch (SQLException ex) {
            Logger.getLogger(viewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ambilDataTabel() {
        int index = tabelUser.getSelectedRow();
        
        String id = String.valueOf(tabelUser.getValueAt(index, 0));
        String name = String.valueOf(tabelUser.getValueAt(index, 1));
        String pas = String.valueOf(tabelUser.getValueAt(index, 2));
        String lev = String.valueOf(tabelUser.getValueAt(index, 3));
        
        //mengisi nilai kedalam textField
        idUser.setText(id);
        username.setText(name);
        password.setText(pas);
        level.setSelectedItem(lev);
        
        cU.controlButton1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelUser = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idUser = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        tombolEdit = new javax.swing.JButton();
        tombolDelete = new javax.swing.JButton();
        tombolCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        level = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);

        tabelUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelUser.setRowHeight(25);
        tabelUser.setShowVerticalLines(false);
        tabelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelUser);

        jLabel1.setText("ID User");

        jLabel2.setText("Username");

        idUser.setEnabled(false);

        tombolEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tombolEdit.setText("Ubah");
        tombolEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolEditActionPerformed(evt);
            }
        });

        tombolDelete.setText("Hapus");
        tombolDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolDeleteActionPerformed(evt);
            }
        });

        tombolCancel.setText("Batal");
        tombolCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCancelActionPerformed(evt);
            }
        });

        jLabel3.setText("Password");

        jLabel4.setText("Level");

        level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Kasir" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tombolDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(tombolCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idUser)
                            .addComponent(username)
                            .addComponent(password)
                            .addComponent(level, 0, 200, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tombolDelete)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolEdit)
                    .addComponent(tombolCancel))
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("USER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolEditActionPerformed
        // TODO add your handling code here:
        cU.editUser();
        tampilDataUser();
    }//GEN-LAST:event_tombolEditActionPerformed

    private void tombolDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolDeleteActionPerformed
        // TODO add your handling code here:
        cU.deleteUser();
        tampilDataUser();
    }//GEN-LAST:event_tombolDeleteActionPerformed

    private void tombolCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCancelActionPerformed
        // TODO add your handling code here:
        cU.controlButton2();
        cU.deleteForm();
    }//GEN-LAST:event_tombolCancelActionPerformed

    private void tabelUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelUserMouseClicked
        // TODO add your handling code here:
        ambilDataTabel();
    }//GEN-LAST:event_tabelUserMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> level;
    private javax.swing.JTextField password;
    private javax.swing.JTable tabelUser;
    private javax.swing.JButton tombolCancel;
    private javax.swing.JButton tombolDelete;
    private javax.swing.JButton tombolEdit;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
