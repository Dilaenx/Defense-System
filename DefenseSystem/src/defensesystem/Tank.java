/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defensesystem;

/**
 *
 * @author dilae
 */
public class Tank extends javax.swing.JFrame implements SuperDefence{
    boolean position;
    int operation;
    int task;
    Maincontroller maincontroller;
    /**
     * Creates new form Tank
     */
    public Tank() {
        initComponents();
        this.setVisible(true);
        ShootBtn.setEnabled(false);
        missileOperationBtn.setEnabled(false);
        redarOperationbtn.setEnabled(false);
        rotateShootingBtn.setEnabled(false);
        
    }
    public void addMainController(Maincontroller maincontroller){
    this.maincontroller=maincontroller;
    
    }
    
    public void update(int operation){
        this.operation=operation;
        if(position){
        if(operation>15){ShootBtn.setEnabled(true);}else{ShootBtn.setEnabled(false);}
        if(operation>20){missileOperationBtn.setEnabled(true);}else{missileOperationBtn.setEnabled(false);}
        if(operation>50){redarOperationbtn.setEnabled(true);}else{redarOperationbtn.setEnabled(false);}
        if(operation>75){rotateShootingBtn.setEnabled(true);}else{rotateShootingBtn.setEnabled(false);}
        }else{
        ShootBtn.setEnabled(false);
        missileOperationBtn.setEnabled(false);
        redarOperationbtn.setEnabled(false);
        rotateShootingBtn.setEnabled(false);
        }
    }
    public void mainMessageJTextArea(String typeMessage){
        mainMessageJTextArea.append("task "+(++task)+":- "+typeMessage+"\n");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        ShootBtn = new javax.swing.JButton();
        redarOperationbtn = new javax.swing.JButton();
        missileOperationBtn = new javax.swing.JButton();
        rotateShootingBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainMessageJTextArea = new javax.swing.JTextArea();
        sendMessagetomain = new javax.swing.JTextField();
        sendMessagetomainBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        positionBtn = new javax.swing.JToggleButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tank");
        setResizable(false);

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Area Not Cleared");

        ShootBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        ShootBtn.setText("Shoot");
        ShootBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShootBtnActionPerformed(evt);
            }
        });

        redarOperationbtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        redarOperationbtn.setText("Redar Operation");
        redarOperationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redarOperationbtnActionPerformed(evt);
            }
        });

        missileOperationBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        missileOperationBtn.setText("Missile Operation");
        missileOperationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missileOperationBtnActionPerformed(evt);
            }
        });

        rotateShootingBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        rotateShootingBtn.setText("RotateShooting");
        rotateShootingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateShootingBtnActionPerformed(evt);
            }
        });

        mainMessageJTextArea.setColumns(20);
        mainMessageJTextArea.setRows(5);
        jScrollPane1.setViewportView(mainMessageJTextArea);

        sendMessagetomain.setText("Type Message...");
        sendMessagetomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessagetomainActionPerformed(evt);
            }
        });

        sendMessagetomainBtn.setText("Send");
        sendMessagetomainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessagetomainBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Soldier Count");

        jLabel3.setText("Soldier Count");

        positionBtn.setText("Position");
        positionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sendMessagetomain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendMessagetomainBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ShootBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redarOperationbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(missileOperationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rotateShootingBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(positionBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ShootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(missileOperationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redarOperationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotateShootingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(positionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sendMessagetomainBtn)
                            .addComponent(sendMessagetomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShootBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShootBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShootBtnActionPerformed

    private void redarOperationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redarOperationbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redarOperationbtnActionPerformed

    private void missileOperationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missileOperationBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_missileOperationBtnActionPerformed

    private void rotateShootingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateShootingBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rotateShootingBtnActionPerformed

    private void positionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionBtnActionPerformed
        // TODO add your handling code here:
        position=positionBtn.getModel().isSelected();
        this.update(operation);
    }//GEN-LAST:event_positionBtnActionPerformed

    private void sendMessagetomainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessagetomainBtnActionPerformed
        // TODO add your handling code here:
        String Message ="War Tank :"+sendMessagetomain.getText();
       maincontroller.sendMsgToMain(Message);
      sendMessagetomain.setText("");
       
    }//GEN-LAST:event_sendMessagetomainBtnActionPerformed

    private void sendMessagetomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessagetomainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendMessagetomainActionPerformed

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
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ShootBtn;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea mainMessageJTextArea;
    private javax.swing.JButton missileOperationBtn;
    private javax.swing.JToggleButton positionBtn;
    private javax.swing.JButton redarOperationbtn;
    private javax.swing.JButton rotateShootingBtn;
    private javax.swing.JTextField sendMessagetomain;
    private javax.swing.JButton sendMessagetomainBtn;
    // End of variables declaration//GEN-END:variables
}
