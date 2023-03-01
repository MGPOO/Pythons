package ec.edu.espe.fashionStore.view;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.fashionStore.controller.ControllerClothCatalogue;
import ec.edu.espe.fashionstore.model.ClothCatalogue;
import javax.swing.JOptionPane;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class FrmEditClothModel extends javax.swing.JFrame {

    /**
     * Creates new form EditClothModel
     */
    public FrmEditClothModel() {
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

        pnlinput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEditName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEditType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEditColor = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        pnlButtons = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFashionStore = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        itmReportIssues = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fashion Store - Edit Cloth Model");

        jLabel1.setFont(new java.awt.Font("Trajan Pro 3", 0, 12)); // NOI18N
        jLabel1.setText("EDIT CLOTH MODEL");

        jLabel2.setText("Search Id:");

        jLabel3.setText("Edit name: ");

        txtEditName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditNameKeyTyped(evt);
            }
        });

        jLabel4.setText("Edit type:");

        txtEditType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditTypeKeyTyped(evt);
            }
        });

        jLabel5.setText("Edit color:");

        txtEditColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditColorKeyTyped(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlinputLayout = new javax.swing.GroupLayout(pnlinput);
        pnlinput.setLayout(pnlinputLayout);
        pnlinputLayout.setHorizontalGroup(
            pnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinputLayout.createSequentialGroup()
                .addGroup(pnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlinputLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(pnlinputLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(pnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlinputLayout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFind))
                            .addGroup(pnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEditName)
                                .addComponent(txtEditType)
                                .addComponent(txtEditColor, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        pnlinputLayout.setVerticalGroup(
            pnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlinputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnFind)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEditType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEditColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaveChanges)
                .addGap(30, 30, 30)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSaveChanges)
                    .addComponent(btnDelete))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        mnuFashionStore.setText("Fashion Store");

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        mnuFashionStore.add(itmAbout);

        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        mnuFashionStore.add(itmExit);

        jMenuBar1.add(mnuFashionStore);

        jMenu6.setText("Help");

        itmReportIssues.setText("Report Issues");
        itmReportIssues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReportIssuesActionPerformed(evt);
            }
        });
        jMenu6.add(itmReportIssues);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        FrmClothCatalogue clothCatalogue = new FrmClothCatalogue();
        clothCatalogue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Cloth Model ID field is empty", "Empty Field", JOptionPane.WARNING_MESSAGE);
        } else {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to continue?");
            if (option == 0) {

                int id = Integer.parseInt(txtId.getText());
                String uri = "mongodb+srv://17POO:password555@fashionstore.nh5mcou.mongodb.net/test";

                try ( MongoClient mongoClient = MongoClients.create(uri)) {
                    MongoDatabase database = mongoClient.getDatabase("FashionStore");

                    try {
                        //Conection with database server
                        Bson command = new BsonDocument("ping", new BsonInt64(1));
                        org.bson.Document commandResult = database.runCommand(command);
                        System.out.println("Connected successfully to server.");
                        ClothCatalogue clothCatalogue = ControllerClothCatalogue.readMongo(database, id);
                        ControllerClothCatalogue.deleteMongo(database, clothCatalogue);
                        JOptionPane.showMessageDialog(this, "Cloth Model Delete");
                    } catch (MongoException me) {
                        System.err.println("An error ocurred while attempting to connect: " + me);
                    }
                }
            } else if (option == 1) {
                JOptionPane.showMessageDialog(this, "Operation Cancelled");
            } else if (option == 2) {
                FrmClothCatalogue clothCatalogue = new FrmClothCatalogue();
                clothCatalogue.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        String uri = "mongodb+srv://17POO:password555@fashionstore.nh5mcou.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("FashionStore");

            try {
                //Conection with database server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                ClothCatalogue clothCatalogue = ControllerClothCatalogue.readMongo(database, id);

                String name = clothCatalogue.getName();
                String type = clothCatalogue.getType();
                String color = clothCatalogue.getColor();

                txtEditName.setText(name);
                txtEditType.setText(type);
                txtEditColor.setText(color);

            } catch (MongoException me) {
                System.err.println("An error ocurred while attempting to connect: " + me);
            }
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed

        if (txtEditName.getText().isBlank() && txtEditColor.getText().isBlank() && txtEditType.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Fill at least one of the fields.", "Error", ERROR);
        } else {

            String uri = "mongodb+srv://17POO:password555@fashionstore.nh5mcou.mongodb.net/test";

            try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("FashionStore");

                try {
                    //Conection with database server
                    Bson command = new BsonDocument("ping", new BsonInt64(1));
                    org.bson.Document commandResult = database.runCommand(command);
                    System.out.println("Connected successfully to server.");

                    int id = Integer.parseInt(txtId.getText());
                    ClothCatalogue clothCatalogue = ControllerClothCatalogue.readMongo(database, id);
                    String name = txtEditName.getText();
                    String type = txtEditType.getText();
                    String color = txtEditColor.getText();

                    clothCatalogue = new ClothCatalogue(id, name, type, color);
                    ControllerClothCatalogue.updateMongo(database, clothCatalogue);
                    JOptionPane.showMessageDialog(this, "Cloth Model updated succesfully");
                } catch (MongoException me) {
                    System.err.println("An error ocurred while attempting to connect: " + me);
                }
            }
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        char a = evt.getKeyChar();

        if ((Character.isDigit(a)) || (Character.isISOControl(a))) {
            txtId.setEditable(true);
        } else {
            txtId.setEditable(false);
            JOptionPane.showMessageDialog(this, a + " is not accepted here", "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtEditNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditNameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((Character.isLetter(c)) || (Character.isWhitespace(c)) || (Character.isISOControl(c))) {
            txtEditName.setEditable(true);
        } else {
            txtEditName.setEditable(false);
            JOptionPane.showMessageDialog(this, c + " is not accepted here", "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtEditNameKeyTyped

    private void txtEditTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditTypeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((Character.isLetter(c)) || (Character.isWhitespace(c)) || (Character.isISOControl(c))) {
            txtEditType.setEditable(true);
        } else {
            txtEditType.setEditable(false);
            JOptionPane.showMessageDialog(this, c + " is not accepted here", "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtEditTypeKeyTyped

    private void txtEditColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditColorKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if ((Character.isLetter(c)) || (Character.isWhitespace(c)) || (Character.isISOControl(c))) {
            txtEditColor.setEditable(true);
        } else {
            txtEditColor.setEditable(false);
            JOptionPane.showMessageDialog(this, c + " is not accepted here", "Warning on input data", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtEditColorKeyTyped

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        FrmAbout about = new FrmAbout();
        about.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itmAboutActionPerformed

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmReportIssuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReportIssuesActionPerformed
        FrmReportIssue report = new FrmReportIssue();
        report.setVisible(true);
    }//GEN-LAST:event_itmReportIssuesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEditClothModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditClothModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditClothModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditClothModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditClothModel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmReportIssues;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuFashionStore;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlinput;
    private javax.swing.JTextField txtEditColor;
    private javax.swing.JTextField txtEditName;
    private javax.swing.JTextField txtEditType;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
