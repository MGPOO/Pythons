package ec.edu.espe.fashionStore.view;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class FrmClothCatalogue extends javax.swing.JFrame {

    /**
     * Creates new form EditCatalogue
     */
    public FrmClothCatalogue() {
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

        pnlButtons = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAddClothModel = new javax.swing.JButton();
        btnEditClothModel = new javax.swing.JButton();
        btnReviewClothModel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFashionStore = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fashion Store - Cloth Catalogue");

        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 0, 14)); // NOI18N
        jLabel1.setText(" Cloth Catalogue");

        btnAddClothModel.setText("Add Cloth Model");
        btnAddClothModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClothModelActionPerformed(evt);
            }
        });

        btnEditClothModel.setText("Edit Cloth Model");
        btnEditClothModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditClothModelActionPerformed(evt);
            }
        });

        btnReviewClothModel.setText("Review Cloth Model");
        btnReviewClothModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewClothModelActionPerformed(evt);
            }
        });

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlButtonsLayout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jLabel1)
                            .addGap(16, 16, 16))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAddClothModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEditClothModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlButtonsLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReviewClothModel)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddClothModel)
                .addGap(18, 18, 18)
                .addComponent(btnEditClothModel)
                .addGap(18, 18, 18)
                .addComponent(btnReviewClothModel)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        mnuFashionStore.setText("Fashion Store");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuFashionStore.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuFashionStore.add(jMenuItem2);

        jMenuBar1.add(mnuFashionStore);

        jMenu6.setText("Help");

        jMenuItem3.setText("Report Issues");
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddClothModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClothModelActionPerformed
        // TODO add your handling code here:
        FrmAddClothModel addClothModel = new FrmAddClothModel();
        addClothModel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddClothModelActionPerformed

    private void btnEditClothModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditClothModelActionPerformed
        // TODO add your handling code here:
        FrmEditClothModel editClothModel = new FrmEditClothModel();
        editClothModel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditClothModelActionPerformed

    private void btnReviewClothModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewClothModelActionPerformed
        // TODO add your handling code here:
        FrmReviewClothModel reviewClothModel = new FrmReviewClothModel();
        reviewClothModel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReviewClothModelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_btnBackActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmAbout about = new FrmAbout();
        about.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmClothCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClothCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClothCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClothCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClothCatalogue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClothModel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditClothModel;
    private javax.swing.JButton btnReviewClothModel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu mnuFashionStore;
    private javax.swing.JPanel pnlButtons;
    // End of variables declaration//GEN-END:variables
}
