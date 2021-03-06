/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vending_Machines;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Vending_Machine extends javax.swing.JFrame {

    /**
     * Creates new form Vending_Machine
     */
    public Vending_Machine() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        spriteRB = new javax.swing.JRadioButton();
        pepsiRB = new javax.swing.JRadioButton();
        tigerRB = new javax.swing.JRadioButton();
        cokeRB = new javax.swing.JRadioButton();
        waterRB = new javax.swing.JRadioButton();
        rootbeerRB = new javax.swing.JRadioButton();
        purchasBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        cancleBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        insertmoneyTF = new javax.swing.JTextField();
        changeTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vending Machine");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select an Iteam"));

        spriteRB.setText("Sprite $1.25");
        spriteRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteRBActionPerformed(evt);
            }
        });

        pepsiRB.setText("Pepsi $1.50");
        pepsiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiRBActionPerformed(evt);
            }
        });

        tigerRB.setText("Tiger $2.00");
        tigerRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigerRBActionPerformed(evt);
            }
        });

        cokeRB.setText("Coke $1.30");
        cokeRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeRBActionPerformed(evt);
            }
        });

        waterRB.setText("Water $1.00");
        waterRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterRBActionPerformed(evt);
            }
        });

        rootbeerRB.setText("Root Beer $1.25");
        rootbeerRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootbeerRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spriteRB)
                    .addComponent(cokeRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pepsiRB)
                    .addComponent(waterRB))
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tigerRB)
                    .addComponent(rootbeerRB))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spriteRB)
                    .addComponent(pepsiRB)
                    .addComponent(tigerRB))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cokeRB)
                    .addComponent(waterRB)
                    .addComponent(rootbeerRB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        purchasBtn.setText("Purchas");
        purchasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchasBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        cancleBtn.setText("Cancle");
        cancleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Insert Money:");

        jLabel3.setText("change:");

        insertmoneyTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertmoneyTFActionPerformed(evt);
            }
        });

        changeTF.setEditable(false);
        changeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(purchasBtn)
                        .addGap(118, 118, 118)
                        .addComponent(clearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancleBtn)
                        .addGap(89, 89, 89))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(insertmoneyTF)
                            .addComponent(changeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertmoneyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchasBtn)
                    .addComponent(clearBtn)
                    .addComponent(cancleBtn))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spriteRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriteRBActionPerformed
        // changing radio button to select only one
        
        if(spriteRB.isSelected()){
            cokeRB.setSelected(false);
            pepsiRB.setSelected(false);
            waterRB.setSelected(false);
            tigerRB.setSelected(false);
            rootbeerRB.setSelected(false);
            
        }
        
    }//GEN-LAST:event_spriteRBActionPerformed

    private void cancleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleBtnActionPerformed
        // cancle selection
        
        System.exit(0);
    }//GEN-LAST:event_cancleBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // clears all selection & textfields
        
        spriteRB.setSelected(false);
        cokeRB.setSelected(false);
        pepsiRB.setSelected(false);
        waterRB.setSelected(false);
        tigerRB.setSelected(false);
        rootbeerRB.setSelected(false);
        insertmoneyTF.setText(" ");
        changeTF.setText(" ");
        
    }//GEN-LAST:event_clearBtnActionPerformed

    private void pepsiRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsiRBActionPerformed
        // TODO add your handling code here:
        
        if(pepsiRB.isSelected()){
            cokeRB.setSelected(false);
            spriteRB.setSelected(false);
            waterRB.setSelected(false);
            tigerRB.setSelected(false);
            rootbeerRB.setSelected(false);
            
        }
    }//GEN-LAST:event_pepsiRBActionPerformed

    private void tigerRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigerRBActionPerformed
        // TODO add your handling code here:
        
        if(tigerRB.isSelected()){
            cokeRB.setSelected(false);
            spriteRB.setSelected(false);
            waterRB.setSelected(false);
            pepsiRB.setSelected(false);
            rootbeerRB.setSelected(false);
            
        }
    }//GEN-LAST:event_tigerRBActionPerformed

    private void cokeRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeRBActionPerformed
        // TODO add your handling code here:
        
        if(cokeRB.isSelected()){
            tigerRB.setSelected(false);
            spriteRB.setSelected(false);
            waterRB.setSelected(false);
            pepsiRB.setSelected(false);
            rootbeerRB.setSelected(false);
            
        }
    }//GEN-LAST:event_cokeRBActionPerformed

    private void waterRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterRBActionPerformed
        // TODO add your handling code here:
        
        if(waterRB.isSelected()){
            tigerRB.setSelected(false);
            spriteRB.setSelected(false);
            cokeRB.setSelected(false);
            pepsiRB.setSelected(false);
            rootbeerRB.setSelected(false);
            
        }
    }//GEN-LAST:event_waterRBActionPerformed

    private void rootbeerRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootbeerRBActionPerformed
        // TODO add your handling code here:
        
        if(rootbeerRB.isSelected()){
            tigerRB.setSelected(false);
            spriteRB.setSelected(false);
            cokeRB.setSelected(false);
            pepsiRB.setSelected(false);
            waterRB.setSelected(false);
            
        }
    }//GEN-LAST:event_rootbeerRBActionPerformed

    private void purchasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchasBtnActionPerformed
        // TODO add your handling code here:
        
        double money = 0;
        
        money = Double.parseDouble(insertmoneyTF.getText());
        if(spriteRB.isSelected()){
            money = money - 1.25;
        }else if(cokeRB.isSelected()){
            money = money - 1.30;
        }else if(pepsiRB.isSelected()){
            money = money - 1.50;
        }else if(waterRB.isSelected()){
            money = money - 1.00;
        }else if(tigerRB.isSelected()){
            money = money - 2.00;
        }else if(rootbeerRB.isSelected()){
            money = money - 1.25;
        }
        
        if(money < 0){
            JOptionPane.showMessageDialog(rootPane, "Sorry You Do Not Enough Money");
        }else{
        
            changeTF.setText(Double.toString(money));
        }
    }//GEN-LAST:event_purchasBtnActionPerformed

    private void insertmoneyTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertmoneyTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertmoneyTFActionPerformed

    private void changeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeTFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vending_Machine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vending_Machine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vending_Machine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vending_Machine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vending_Machine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancleBtn;
    private javax.swing.JTextField changeTF;
    private javax.swing.JButton clearBtn;
    private javax.swing.JRadioButton cokeRB;
    private javax.swing.JTextField insertmoneyTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton pepsiRB;
    private javax.swing.JButton purchasBtn;
    private javax.swing.JRadioButton rootbeerRB;
    private javax.swing.JRadioButton spriteRB;
    private javax.swing.JRadioButton tigerRB;
    private javax.swing.JRadioButton waterRB;
    // End of variables declaration//GEN-END:variables
}
