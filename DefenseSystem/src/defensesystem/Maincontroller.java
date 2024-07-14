/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defensesystem;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author dilae
 */
public class Maincontroller extends javax.swing.JFrame {
    private DefenceObservable defenceObservable;
    private String typeMessage;
    private Helicopter helicopter;
    private Tank tank;
    private SubMarine submarine;
    /**
     * Creates new form Maincontroller
     */
    public Maincontroller() {
        
        initComponents();
       DefenceObservable defenceObservable = new DefenceObservable();
       this.defenceObservable=defenceObservable;
       
       Helicopter helicopter = new Helicopter();
       SubMarine submarine=new SubMarine();
       Tank tank =new Tank();
       
       this.helicopter=helicopter;
       this.submarine=submarine;
       this.tank=tank;
       defenceObservable.addSuperDefence(this ,helicopter);
       defenceObservable.addSuperDefence(this ,submarine);
       defenceObservable.addSuperDefence(this ,tank);
       
    }
    
    public void sendMsgToMain(String Message){
        msgJTextArea.append(Message+"\n");
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        collectionInformation = new javax.swing.JTable();
        operationJSlider = new javax.swing.JSlider();
        sendJTextField = new javax.swing.JTextField();
        helicopterPin = new javax.swing.JRadioButton();
        tankPin = new javax.swing.JRadioButton();
        submarinepin = new javax.swing.JRadioButton();
        sendPrivate = new javax.swing.JButton();
        sendAllBtn = new javax.swing.JButton();
        areaNotClearedBtn = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgJTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        helicopterBtn = new javax.swing.JToggleButton();
        warTankBtn = new javax.swing.JToggleButton();
        submarineBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Controller");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Collection Information");

        collectionInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Helicopter", "", null, null},
                {"Tank", null, null, null},
                {"Submarine", null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Super Defence", "Soldier Count", "Fuel amount", "Ammo Amount"
            }
        ));
        collectionInformation.setShowGrid(true);
        collectionInformation.setSurrendersFocusOnKeystroke(true);
        collectionInformation.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                collectionInformationAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(collectionInformation);

        operationJSlider.setMajorTickSpacing(10);
        operationJSlider.setPaintLabels(true);
        operationJSlider.setPaintTicks(true);
        operationJSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                operationJSliderStateChanged(evt);
            }
        });

        sendJTextField.setText("Type Message...");
        sendJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendJTextFieldActionPerformed(evt);
            }
        });

        helicopterPin.setText("Helicopter");
        helicopterPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helicopterPinActionPerformed(evt);
            }
        });

        tankPin.setText("Tank");
        tankPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tankPinActionPerformed(evt);
            }
        });

        submarinepin.setText("Submarine");
        submarinepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submarinepinActionPerformed(evt);
            }
        });

        sendPrivate.setText("Send Private");
        sendPrivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPrivateActionPerformed(evt);
            }
        });

        sendAllBtn.setText("Send All");
        sendAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendAllBtnActionPerformed(evt);
            }
        });

        areaNotClearedBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        areaNotClearedBtn.setText("Area Cleared");
        areaNotClearedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaNotClearedBtnActionPerformed(evt);
            }
        });

        msgJTextArea.setColumns(20);
        msgJTextArea.setRows(5);
        jScrollPane2.setViewportView(msgJTextArea);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Super Defence");

        helicopterBtn.setText("Helicopter");
        helicopterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helicopterBtnActionPerformed(evt);
            }
        });

        warTankBtn.setText("War Tank");
        warTankBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warTankBtnActionPerformed(evt);
            }
        });

        submarineBtn.setText("Submarine");
        submarineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submarineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(areaNotClearedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(sendJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(helicopterPin)
                                        .addGap(1, 1, 1)
                                        .addComponent(tankPin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(submarinepin)
                                        .addGap(7, 7, 7)
                                        .addComponent(sendPrivate))
                                    .addComponent(sendAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(operationJSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helicopterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warTankBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submarineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(helicopterBtn)
                    .addComponent(warTankBtn)
                    .addComponent(submarineBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(operationJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(helicopterPin)
                                .addComponent(submarinepin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tankPin))
                            .addComponent(sendPrivate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sendJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(areaNotClearedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helicopterPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helicopterPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helicopterPinActionPerformed

    private void tankPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tankPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tankPinActionPerformed

    private void submarinepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submarinepinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submarinepinActionPerformed

    private void sendPrivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPrivateActionPerformed
        // TODO add your handling code here:
        typeMessage =sendJTextField.getText();
        if(helicopterPin.isSelected())defenceObservable.sendMessageFromMain(typeMessage,this.helicopter);
        if(tankPin.isSelected())defenceObservable.sendMessageFromMain(typeMessage,tank);
        if(submarinepin.isSelected())defenceObservable.sendMessageFromMain(typeMessage,submarine);
        
        
        sendJTextField.setText("");
    }//GEN-LAST:event_sendPrivateActionPerformed

    private void operationJSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_operationJSliderStateChanged
        // TODO add your handling code here:
        operationJSlider.addChangeListener(new ChangeListener(){
        public void stateChanged(ChangeEvent evt){
            int operation=operationJSlider.getValue();
            defenceObservable.setOperation(operation);
            
        }
        });
    }//GEN-LAST:event_operationJSliderStateChanged

    private void sendJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendJTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_sendJTextFieldActionPerformed

    private void sendAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendAllBtnActionPerformed
        // TODO add your handling code here:
        typeMessage =sendJTextField.getText();
        defenceObservable.sendMessageFromMain(typeMessage);
        
        sendJTextField.setText("");
        
    }//GEN-LAST:event_sendAllBtnActionPerformed

    private void areaNotClearedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaNotClearedBtnActionPerformed
        // TODO add your handling code here:
        boolean areaStatus =!areaNotClearedBtn.getModel().isSelected();
        defenceObservable.areaStatus(areaStatus);
    }//GEN-LAST:event_areaNotClearedBtnActionPerformed

    private void collectionInformationAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_collectionInformationAncestorAdded
        // TODO add your handling code here:
      
    }//GEN-LAST:event_collectionInformationAncestorAdded

    private void helicopterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helicopterBtnActionPerformed
        // TODO add your handling code here:
        boolean select =helicopterBtn.isSelected();
        if(select){
            
            helicopter.setVisible(true);
        }
        if(!select){
            
            helicopter.setVisible(false);
        }
    }//GEN-LAST:event_helicopterBtnActionPerformed

    private void warTankBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warTankBtnActionPerformed
        // TODO add your handling code here:
         boolean select =warTankBtn.isSelected();
        if(select){
            
            tank.setVisible(true);
        }
        if(!select){
            
            tank.setVisible(false);
        }
    }//GEN-LAST:event_warTankBtnActionPerformed

    private void submarineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submarineBtnActionPerformed
    boolean select =submarineBtn.isSelected();
        if(select){
            
            submarine.setVisible(true);
        }
        if(!select){
            
            submarine.setVisible(false);
        }     
// TODO add your handling code here:
    }//GEN-LAST:event_submarineBtnActionPerformed
  public void setValueAt(int value, int row, int col) {
        
        collectionInformation.setValueAt(value, row, col);
    }
  
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
            java.util.logging.Logger.getLogger(Maincontroller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maincontroller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maincontroller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maincontroller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maincontroller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton areaNotClearedBtn;
    private javax.swing.JTable collectionInformation;
    private javax.swing.JToggleButton helicopterBtn;
    private javax.swing.JRadioButton helicopterPin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea msgJTextArea;
    private javax.swing.JSlider operationJSlider;
    private javax.swing.JButton sendAllBtn;
    private javax.swing.JTextField sendJTextField;
    private javax.swing.JButton sendPrivate;
    private javax.swing.JToggleButton submarineBtn;
    private javax.swing.JRadioButton submarinepin;
    private javax.swing.JRadioButton tankPin;
    private javax.swing.JToggleButton warTankBtn;
    // End of variables declaration//GEN-END:variables
}
