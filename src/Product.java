
import Db.DatabaseUtil;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.table.TableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author AYMAN
 */
public class Product extends javax.swing.JFrame {

    private int ProductPk = 0;

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        setLocationRelativeTo(null);

    }

    private boolean validateFields() {

        if (!txtname.getText().equals("") && !txtPrix.getText().equals("") && !txtquan.getText().equals("")) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtquan = new javax.swing.JTextField();
        txtPrix = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabProduct = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Product management ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("nom produit");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 214, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Quantité en stock ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 284, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Prix unitaire ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 354, -1, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 252, 289, -1));

        txtquan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtquan, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 322, 289, -1));

        txtPrix.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtPrix, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 392, 289, -1));

        tabProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nom de produit ", "Quantité en stock", "Prix unitaire "
            }
        ));
        tabProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabProduct);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 188, 545, 283));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Ajouter");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 483, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Modifier");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 483, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 483, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Rester");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 483, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Fermer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 483, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Chercher :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 118, -1, -1));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 144, 346, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/50-Beautiful-and-Minimalist-Presentation-Backgrounds-042.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String name = txtname.getText();
        String quan = txtquan.getText();
        String price = txtPrix.getText();

        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "all field all requierd");
        } else {
            try {
                Connection con = DatabaseUtil.getConnection();
                // Setting values for the placeholders
                PreparedStatement ps = con.prepareStatement("INSERT INTO Product    (ArticleName  , StockQuantity  , UnitPrice ) VALUES (?, ?, ?)");

                // Setting values for the placeholders
                ps.setString(1, name);
                ps.setString(2, quan);
                ps.setString(3, price);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Article   added successfully");
                new Product().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

        DefaultTableModel md = (DefaultTableModel) tabProduct.getModel();
        md.setRowCount(0);

        try {
            Connection con = DatabaseUtil.getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM Product   ";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                md.addRow(new Object[]{
                    rs.getString("ProductID"),
                    rs.getString("ArticleName"),
                    rs.getInt("StockQuantity"),
                    rs.getInt("UnitPrice"),});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        btnUpdate.setEnabled(false);

    }//GEN-LAST:event_formComponentShown

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        String name = txtname.getText();
        String quan = txtquan.getText();
        String price = txtPrix.getText();

        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "all field all requierd");
        } else {
            try {
                Connection con = DatabaseUtil.getConnection();
                // Setting values for the placeholders
                PreparedStatement ps = con.prepareStatement("UPDATE Product  SET ArticleName =?, StockQuantity =?, UnitPrice =? WHERE ProductID =?");

                // Setting values for the placeholders
                ps.setString(1, name);
                ps.setString(2, quan);
                ps.setString(3, price);
                ps.setInt(4, ProductPk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product UPDATED successfully");
                new Product().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tabProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProductMouseClicked
        // TODO add your handling code here:

        int index = tabProduct.getSelectedRow();  
        TableModel model = tabProduct.getModel();
        String id = model.getValueAt(index, 0).toString();
        ProductPk = Integer.parseInt(id);

        String name = model.getValueAt(index, 1).toString();
        txtname.setText(name);

        String quan = model.getValueAt(index, 2).toString();
        txtquan.setText(quan);

        String price = model.getValueAt(index, 3).toString();
        txtPrix.setText(price);

        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

    }//GEN-LAST:event_tabProductMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        int selectedRow = tabProduct.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            try {
                // Get the FournisseurID from the selected row
                int ProductID = Integer.parseInt(tabProduct.getValueAt(selectedRow, 0).toString());

                // Execute the DELETE SQL query
                Connection con = DatabaseUtil.getConnection();

                PreparedStatement ps = con.prepareStatement("DELETE FROM Product WHERE ProductID = ?");
                ps.setInt(1, ProductID);
                ps.executeUpdate();

                // Refresh the table data
                DefaultTableModel model = (DefaultTableModel) tabProduct.getModel();
                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(this, "Record deleted successfully.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Product().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel md = (DefaultTableModel) tabProduct.getModel();
        md.setRowCount(0);

        try {
            Connection con = DatabaseUtil.getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM Product where  ArticleName  like '%" + txtSearch.getText() + "%'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                md.addRow(new Object[]{
                    rs.getString("ProductID"),
                    rs.getString("ArticleName"),
                    rs.getInt("StockQuantity"),
                    rs.getInt("UnitPrice"),});
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabProduct;
    private javax.swing.JTextField txtPrix;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtquan;
    // End of variables declaration//GEN-END:variables
}
