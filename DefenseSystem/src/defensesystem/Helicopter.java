/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defensesystem;

/**
 *
 * @author dilae
 */
public class Helicopter extends javax.swing.JFrame implements SuperDefence{
     boolean position;
     int operation;
     int task;
     Maincontroller maincontroller;
     
     
    /**
     * Creates new form Helicopter
     */
    public Helicopter() {
        
        initComponents();
     
 
        shootBtn.setEnabled(false);
        missileOperationBtn.setEnabled(false);
        laserOperationbtn.setEnabled(false);
    }
    
    public void addMainController(Maincontroller maincontroller){
    this.maincontroller=maincontroller;
    
    }
    public void update(int operation){
        this.operation=operation;
        if(position){
        if(operation>25){shootBtn.setEnabled(true);}else{shootBtn.setEnabled(false);}
        if(operation>50){missileOperationBtn.setEnabled(true);}else{missileOperationBtn.setEnabled(false);}
        if(operation>75){laserOperationbtn.setEnabled(true);}else{laserOperationbtn.setEnabled(false);}
        }else{
        shootBtn.setEnabled(false);
        missileOperationBtn.setEnabled(false);
        laserOperationbtn.setEnabled(false);
        }
    };
    
    public void mainMessageJTextArea(String typeMessage){
        mainMessageJTextArea.append("task "+(++task)+":- "+typeMessage+"\n");
        
    }
    
    public void newAreaStatus(String newAreaStatus){
        areaStatusJLebel.setText(newAreaStatus);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fuelCounter = new javax.swing.JSlider();
        areaStatusJLebel = new javax.swing.JLabel();
        shootBtn = new javax.swing.JButton();
        missileOperationBtn = new javax.swing.JButton();
        laserOperationbtn = new javax.swing.JButton();
        sendMessagetomain = new javax.swing.JTextField();
        mainSendBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        positionBtn = new javax.swing.JToggleButton();
        soldierCount = new javax.swing.JSpinner();
        ammoCount = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainMessageJTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Helicopter");

        fuelCounter.setMajorTickSpacing(10);
        fuelCounter.setOrientation(javax.swing.JSlider.VERTICAL);
        fuelCounter.setPaintLabels(true);
        fuelCounter.setPaintTicks(true);
        fuelCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fuelCounterStateChanged(evt);
            }
        });

        areaStatusJLebel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        areaStatusJLebel.setText("Area Not Cleared");

        shootBtn.setText("Shoot");
        shootBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                shootBtnStateChanged(evt);
            }
        });
        shootBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootBtnActionPerformed(evt);
            }
        });

        missileOperationBtn.setText("Missile Operation");
        missileOperationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missileOperationBtnActionPerformed(evt);
            }
        });

        laserOperationbtn.setText("Laser Operation");
        laserOperationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laserOperationbtnActionPerformed(evt);
            }
        });

        mainSendBtn.setText("Send");
        mainSendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainSendBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Soldier Count");

        jLabel3.setText("Ammo Count");

        positionBtn.setText("Position");
        positionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBtnActionPerformed(evt);
            }
        });

        soldierCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                soldierCountStateChanged(evt);
            }
        });

        ammoCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ammoCountStateChanged(evt);
            }
        });

        mainMessageJTextArea.setColumns(20);
        mainMessageJTextArea.setRows(5);
        mainMessageJTextArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                mainMessageJTextAreaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(mainMessageJTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(areaStatusJLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sendMessagetomain, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainSendBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(laserOperationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(missileOperationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ammoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(soldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(positionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addComponent(fuelCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(areaStatusJLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shootBtn)
                    .addComponent(jLabel2)
                    .addComponent(soldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(missileOperationBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laserOperationbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ammoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(positionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendMessagetomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainSendBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fuelCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fuelCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fuelCounterStateChanged
        // TODO add your handling code here:
        int fuelvalue =fuelCounter.getValue();
        maincontroller.setValueAt(fuelvalue, 0, 2);
    }//GEN-LAST:event_fuelCounterStateChanged

    private void shootBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_shootBtnActionPerformed

    private void missileOperationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missileOperationBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_missileOperationBtnActionPerformed

    private void laserOperationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laserOperationbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laserOperationbtnActionPerformed

    private void shootBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_shootBtnStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_shootBtnStateChanged

    private void positionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionBtnActionPerformed
        // TODO add your handling code here:
        position=positionBtn.getModel().isSelected();
        update(operation);
    }//GEN-LAST:event_positionBtnActionPerformed

    private void mainMessageJTextAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mainMessageJTextAreaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_mainMessageJTextAreaAncestorAdded

    private void mainSendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainSendBtnActionPerformed
        // TODO add your handling code here:
       String Message ="Helicopter  :"+sendMessagetomain.getText();
       maincontroller.sendMsgToMain(Message);
      sendMessagetomain.setText("");
       
    }//GEN-LAST:event_mainSendBtnActionPerformed

    private void soldierCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_soldierCountStateChanged
        // TODO add your handling code here:
        int soldierCountValue =(int) soldierCount.getValue();
        maincontroller.setValueAt(soldierCountValue, 0, 1);
        
    }//GEN-LAST:event_soldierCountStateChanged

    private void ammoCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ammoCountStateChanged
        // TODO add your handling code here:
        int ammoCountValue =(int) ammoCount.getValue();
        maincontroller.setValueAt(ammoCountValue, 0, 3);
    }//GEN-LAST:event_ammoCountStateChanged
    
    
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
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Helicopter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammoCount;
    private javax.swing.JLabel areaStatusJLebel;
    private javax.swing.JSlider fuelCounter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton laserOperationbtn;
    private javax.swing.JTextArea mainMessageJTextArea;
    private javax.swing.JButton mainSendBtn;
    private javax.swing.JButton missileOperationBtn;
    private javax.swing.JToggleButton positionBtn;
    private javax.swing.JTextField sendMessagetomain;
    private javax.swing.JButton shootBtn;
    private javax.swing.JSpinner soldierCount;
    // End of variables declaration//GEN-END:variables
}
