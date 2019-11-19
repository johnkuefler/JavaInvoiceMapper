/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.ui;

import invoicemapper.CommissionCalculator;
import invoicemapper.CsvInvoiceImporter;
import invoicemapper.dal.ClientDataService;
import invoicemapper.dal.FormatMapDataService;
import invoicemapper.dal.InvoiceDataService;
import invoicemapper.dal.SaleDataService;
import invoicemapper.lib.Client;
import invoicemapper.lib.FormatMap;
import invoicemapper.lib.Invoice;
import invoicemapper.lib.Sale;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author johnk
 */
public class ImportInvoicesUI extends javax.swing.JFrame {

    private ArrayList<Client> clients;
    private ClientDataService clientDataService;
    private SaleDataService saleDataService;
    private InvoiceDataService invoiceDataService;

    private File selectedFile;
    
    /**
     * Creates new form ImportInvoicesUI
     */
    public ImportInvoicesUI() throws SQLException {
        initComponents();
        
        clients = new ArrayList<Client>();
        clientDataService = new ClientDataService();
        saleDataService = new SaleDataService();
        invoiceDataService = new InvoiceDataService();
        
        fetchClients();
    }
    
     public void fetchClients() throws SQLException {
        clients = clientDataService.GetAll();

        DefaultComboBoxModel dml = new DefaultComboBoxModel();
        for (int i = 0; i < clients.size(); i++) {
            dml.addElement(clients.get(i).getName());
        }

        clientSelect.setModel(dml);
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
        jTextArea1 = new javax.swing.JTextArea();
        fileChooser = new javax.swing.JFileChooser();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clientSelect = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        chooseFileButton = new javax.swing.JButton();
        fileNameLabel = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel1.setText("Import Invoice");

        clientSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Client:");

        jLabel3.setText("Date:");

        chooseFileButton.setText("Select File");
        chooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileButtonActionPerformed(evt);
            }
        });

        fileNameLabel.setText("No file selected");

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Amount:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(fileNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(amountText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseFileButton)
                    .addComponent(fileNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(uploadButton)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new MainUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void chooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileButtonActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            
            fileNameLabel.setText(selectedFile.getName());
          
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_chooseFileButtonActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        FormatMapDataService formatMapDataService = new FormatMapDataService();
        String selectedClient = String.valueOf(clientSelect.getSelectedItem());

        FormatMap format = null;
        try {
            format = formatMapDataService.GetByClientName(selectedClient);
        } catch (SQLException ex) {
            Logger.getLogger(ImportInvoicesUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (format == null) {
            JOptionPane.showMessageDialog(this, "No format map is set up for client.");
            return;
        }
        
        Invoice invoice = new Invoice();
        
        try {
            invoice.setDate(new SimpleDateFormat("MM/dd/yyyy").parse(dateText.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(ImportInvoicesUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        invoice.setClientName(selectedClient);
        invoice.setAmount(Float.parseFloat(amountText.getText()));
        
        CsvInvoiceImporter importer = new CsvInvoiceImporter(format);
        try {
            ArrayList<Sale> sales = importer.ImportSalesForInvoice(invoice, selectedFile.getAbsolutePath());
            
            // calculate the commissions for all the sales, sum up as we go
            float totalCommissionsPaid = 0;
            for (Sale s : sales) {
                CommissionCalculator calc = new CommissionCalculator(format.getCommissionRate(), s);
                
                s.setCommission(calc.getCommissionAmount());
                
                totalCommissionsPaid += s.getCommission();
            }
           
            // revenue calculation for invoice
            invoice.setRevenue(invoice.getAmount() - totalCommissionsPaid);
            
            invoiceDataService.Create(invoice);
                   
            for (Sale s: sales) {
                saleDataService.Create(s);
            }
            
            JOptionPane.showMessageDialog(this, "Invoice imported successfully!");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportInvoicesUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ImportInvoicesUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ImportInvoicesUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        dateText.setText("");
    }//GEN-LAST:event_uploadButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ImportInvoicesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportInvoicesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportInvoicesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportInvoicesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ImportInvoicesUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ImportInvoicesUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountText;
    private javax.swing.JButton backButton;
    private javax.swing.JButton chooseFileButton;
    private javax.swing.JComboBox<String> clientSelect;
    private javax.swing.JTextField dateText;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
