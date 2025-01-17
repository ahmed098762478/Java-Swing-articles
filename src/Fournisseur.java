
import Db.DatabaseUtil;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement; // Add this line
import javax.swing.*;
import javax.swing.table.TableModel;

public class Fournisseur extends javax.swing.JFrame {

    private int FournisseurPk = 0;

    /**
     * Creates new form Fournisseur
     */
    public Fournisseur() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private boolean validateFields() {

        if (!txtname.getText().equals("") && !txtcode.getText().equals("") && !txtville.getText().equals("") && !txtadress.getText().equals("")) {
            return false;
        } else {
            return true;
        }
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
        TableFournisseur = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtadress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtville = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Fournisseur management ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        TableFournisseur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "nom", "code", "adresss", "ville"
            }
        ));
        TableFournisseur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFournisseurMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableFournisseur);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 651, 322));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nom");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 100, -1, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 126, 290, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("code");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 164, -1, -1));

        txtcode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 196, 290, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("adress");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 228, -1, -1));

        txtadress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtadress, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 266, 290, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("ville");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 304, -1, -1));

        txtville.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtville, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 336, 290, -1));

        btnSave.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnSave.setText("Ajouter");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnUpdate.setText("modifier");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton3.setText("vider");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 440, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton4.setText("fermer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 440, -1, -1));
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 433, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton1.setText("supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 440, -1, -1));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 241, 26));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Rechercher");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 79, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/50-Beautiful-and-Minimalist-Presentation-Backgrounds-042.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodeActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        //show the data from the database

        DefaultTableModel md = (DefaultTableModel) TableFournisseur.getModel();
        md.setRowCount(0);

        try {
            Connection con = DatabaseUtil.getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT *FROM Fournisseurs;";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                md.addRow(new Object[]{
                    rs.getInt("FournisseurID"),
                    rs.getString("SupplierName"),
                    rs.getString("SupplierCode"),
                    rs.getString("Address"),
                    rs.getString("City"),
               

                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        btnUpdate.setEnabled(false);



    }//GEN-LAST:event_formComponentShown

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtname.getText();
        String code = txtcode.getText();
        String adress = txtadress.getText();   
        String ville = txtville.getText();
  
        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "all field all requierd");
        } else {
            try {
                Connection con = DatabaseUtil.getConnection();
                // Setting values for the placeholders
                PreparedStatement ps = con.prepareStatement("INSERT INTO Fournisseurs (SupplierName, SupplierCode, City, Address) VALUES ( ?, ?, ?,?)");

                // Setting values for the placeholders
                ps.setString(1, name);
                ps.setString(2, code);
                ps.setString(3, adress);
                ps.setString(4, ville);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Fournisseur added successfully");
                new Fournisseur().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new Fournisseur().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TableFournisseurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFournisseurMouseClicked
        // TODO add your handling code here:
        int index = TableFournisseur.getSelectedRow();
        TableModel model = TableFournisseur.getModel();
        String id = model.getValueAt(index, 0).toString();
        FournisseurPk = Integer.parseInt(id);

        String name = model.getValueAt(index, 1).toString();
        txtname.setText(name);

        String code = model.getValueAt(index, 2).toString();
        txtcode.setText(code);

        String adress = model.getValueAt(index, 3).toString();
        txtadress.setText(adress);

        String ville = model.getValueAt(index, 4).toString();
        txtville.setText(ville);

     

        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);


    }//GEN-LAST:event_TableFournisseurMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = txtname.getText();
        String code = txtcode.getText();
        String adress = txtadress.getText();
        String ville = txtville.getText();
      

        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "all field all requierd");
        } else {
            try {
                Connection con = DatabaseUtil.getConnection();
                // Setting values for the placeholders
                PreparedStatement ps = con.prepareStatement("UPDATE Fournisseurs SET SupplierName=?, SupplierCode=?, Address=?, City=?  WHERE FournisseurID=?");

                // Setting values for the placeholders
                ps.setString(1, name);
                ps.setString(2, code);
                ps.setString(3, adress);
                ps.setString(4, ville);

                ps.setInt(5, FournisseurPk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Fournisseur UPDATED successfully");
                new Fournisseur().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here
        // TODO add your handling code here:
        DefaultTableModel md = (DefaultTableModel) TableFournisseur.getModel();
        md.setRowCount(0);

        try {
            Connection con = DatabaseUtil.getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM Fournisseurs where  SupplierName like '%" + txtSearch.getText() + "%'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                md.addRow(new Object[]{
                    rs.getInt("FournisseurID"),
                    rs.getString("SupplierName"),
                    rs.getString("SupplierCode"),
                    rs.getString("Address"),
                    rs.getString("City")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRow = TableFournisseur.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            try {
                // Get the FournisseurID from the selected row
                int fournisseurID = Integer.parseInt(TableFournisseur.getValueAt(selectedRow, 0).toString());

                // Execute the DELETE SQL query
                Connection con = DatabaseUtil.getConnection();

                PreparedStatement ps = con.prepareStatement("DELETE FROM Fournisseurs WHERE FournisseurID = ?");
                ps.setInt(1, fournisseurID);
                ps.executeUpdate();

                // Refresh the table data
                DefaultTableModel model = (DefaultTableModel) TableFournisseur.getModel();
                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(this, "Record deleted successfully.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fournisseur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableFournisseur;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtadress;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtville;
    // End of variables declaration//GEN-END:variables
}
