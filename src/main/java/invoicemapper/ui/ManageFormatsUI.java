/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.ui;

import invoicemapper.dal.ClientDataService;
import invoicemapper.dal.FormatMapDataService;
import invoicemapper.lib.Client;
import invoicemapper.lib.FormatMap;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author johnk
 */
public class ManageFormatsUI extends javax.swing.JFrame {

    private ArrayList<Client> clients;
    private ClientDataService clientDataService;
    private FormatMapDataService formatMapDataService;
    private FormatMap formatMap;
    private boolean newFormatMap;

    /**
     * Creates new form ManageFormatsUI
     */
    public ManageFormatsUI() throws SQLException {
        initComponents();

        clientDataService = new ClientDataService();
        formatMapDataService = new FormatMapDataService();
        clients = new ArrayList<Client>();

        fetchClients();
        fetchFormatMapForSelectedClient();
    }

    public void fetchClients() throws SQLException {
        clients = clientDataService.GetAll();

        DefaultComboBoxModel dml = new DefaultComboBoxModel();
        for (int i = 0; i < clients.size(); i++) {
            dml.addElement(clients.get(i).getName());
        }

        clientSelect.setModel(dml);
    }

    public void fetchFormatMapForSelectedClient() throws SQLException {
        String selectedClient = String.valueOf(clientSelect.getSelectedItem());
        formatMap = formatMapDataService.GetByClientName(selectedClient);


        if (formatMap != null) {
            populateFormFromFormatMap();
            newFormatMap = false;
        } else {
            formatMap = new FormatMap();
            populateFormFromFormatMap();
            newFormatMap = true;
        }
    }

    public void populateFormFromFormatMap() {
        commissionRateText.setText(String.valueOf(formatMap.getCommissionRate()));
        agentIdColumnText.setText(String.valueOf(formatMap.getAgentIdColumn()));
        dateColumnText.setText(String.valueOf(formatMap.getDateColumn()));
        customerNameColumnText.setText(String.valueOf(formatMap.getCustomerNameColumn()));
        customerAddressColumnText.setText(String.valueOf(formatMap.getCustomerAddressColumn()));
        customerCityColumnText.setText(String.valueOf(formatMap.getCustomerCityColumn()));
        customerStateColumnText.setText(String.valueOf(formatMap.getCustomerStateColumn()));
        customerZipColumnText.setText(String.valueOf(formatMap.getCustomerZipColumn()));
        statusColumnText.setText(String.valueOf(formatMap.getStatusColumn()));
        statusReasonColumnText.setText(String.valueOf(formatMap.getStatusReasonColumn()));
        payableColumnText.setText(String.valueOf(formatMap.getPayableColumn()));
        chargebackColumnText.setText(String.valueOf(formatMap.getChargebackColumn()));
        usageColumnText.setText(String.valueOf(formatMap.getUsageColumn()));
        utilityAcctNumberColumnText.setText(String.valueOf(formatMap.getUtilityAccountNumberColumn()));
        verificationNumberColumnText.setText(String.valueOf(formatMap.getVerificationNumberColumn()));
        flex1ColumnText.setText(String.valueOf(formatMap.getFlex1Column()));
        flex2ColumnText.setText(String.valueOf(formatMap.getFlex2Column()));
        flex3ColumnText.setText(String.valueOf(formatMap.getFlex3Column()));
        flex4ColumnText.setText(String.valueOf(formatMap.getFlex4Column()));
        flex5ColumnText.setText(String.valueOf(formatMap.getFlex5Column()));
        amountColumnText.setText(String.valueOf(formatMap.getAmountColumn()));
    }

    public void populateFormatMapFromForm() {
        formatMap.setCommissionRate(Float.parseFloat(commissionRateText.getText()));
        formatMap.setAgentIdColumn(Integer.parseInt(agentIdColumnText.getText()));
        formatMap.setDateColumn(Integer.parseInt(dateColumnText.getText()));
        formatMap.setCustomerNameColumn(Integer.parseInt(customerNameColumnText.getText()));
        formatMap.setCustomerAddressColumn(Integer.parseInt(customerAddressColumnText.getText()));
        formatMap.setCustomerCityColumn(Integer.parseInt(customerCityColumnText.getText()));
        formatMap.setCustomerStateColumn(Integer.parseInt(customerStateColumnText.getText()));
        formatMap.setCustomerZipColumn(Integer.parseInt(customerZipColumnText.getText()));
        formatMap.setStatusColumn(Integer.parseInt(statusColumnText.getText()));
        formatMap.setStatusReasonColumn(Integer.parseInt(statusReasonColumnText.getText()));
        formatMap.setPayableColumn(Integer.parseInt(payableColumnText.getText()));
        formatMap.setChargebackColumn(Integer.parseInt(chargebackColumnText.getText()));
        formatMap.setUsageColumn(Integer.parseInt(usageColumnText.getText()));
        formatMap.setUtilityAccountNumberColumn(Integer.parseInt(utilityAcctNumberColumnText.getText()));
        formatMap.setVerificationNumberColumn(Integer.parseInt(verificationNumberColumnText.getText()));
        formatMap.setFlex1Column(Integer.parseInt(flex1ColumnText.getText()));
        formatMap.setFlex2Column(Integer.parseInt(flex2ColumnText.getText()));
        formatMap.setFlex3Column(Integer.parseInt(flex3ColumnText.getText()));
        formatMap.setFlex4Column(Integer.parseInt(flex4ColumnText.getText()));
        formatMap.setFlex5Column(Integer.parseInt(flex5ColumnText.getText()));
        formatMap.setAmountColumn(Integer.parseInt(amountColumnText.getText()));   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientSelect = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        agentIdColumnText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateColumnText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        customerNameColumnText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        customerAddressColumnText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        customerCityColumnText = new javax.swing.JTextField();
        customerStateColumnText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        customerZipColumnText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        statusColumnText = new javax.swing.JTextField();
        statusReasonColumnText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        payableColumnText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        chargebackColumnText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        usageColumnText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        utilityAcctNumberColumnText = new javax.swing.JTextField();
        verificationNumberColumnText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        flex1ColumnText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        flex2ColumnText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        flex3ColumnText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        flex4ColumnText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        flex5ColumnText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        amountColumnText = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        commissionRateText = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        revertButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clientSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        clientSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientSelectActionPerformed(evt);
            }
        });

        jLabel1.setText("Select client");

        jLabel2.setText("Agent Id ");

        jLabel3.setText("Date ");

        jLabel4.setText("Customer Name ");

        jLabel5.setText("Customer Address");

        jLabel6.setText("Customer City");

        jLabel7.setText("Customer State");

        jLabel8.setText("Customer Zip");

        jLabel9.setText("Status");

        jLabel10.setText("Status Reason");

        jLabel11.setText("Payable");

        jLabel12.setText("Chargeback");

        jLabel13.setText("Usage");

        jLabel14.setText("Utility Acct Number");

        jLabel15.setText("Verification Number");

        jLabel16.setText("Flex1");

        jLabel17.setText("Flex2");

        jLabel18.setText("Flex3");

        jLabel19.setText("Flex4");

        flex5ColumnText.setToolTipText("");

        jLabel20.setText("Flex5");

        jLabel21.setText("Amount");

        jLabel22.setText("Commission Rate");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        revertButton.setText("Revert Changes");
        revertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revertButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Invoice Format Mapping");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(revertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agentIdColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerCityColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statusReasonColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(utilityAcctNumberColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flex3ColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerStateColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(payableColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(verificationNumberColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flex4ColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(customerNameColumnText, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(customerZipColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chargebackColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(flex1ColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(flex5ColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(commissionRateText, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(amountColumnText, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flex2ColumnText, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usageColumnText, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusColumnText, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(customerAddressColumnText))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clientSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(commissionRateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agentIdColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(customerAddressColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(customerNameColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerCityColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerStateColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(customerZipColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(statusReasonColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(payableColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(chargebackColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usageColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(utilityAcctNumberColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(verificationNumberColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flex1ColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(flex2ColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(flex3ColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(flex4ColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(flex5ColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountColumnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revertButton)
                    .addComponent(saveButton))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String selectedClient = String.valueOf(clientSelect.getSelectedItem());

        populateFormatMapFromForm();
        
        if (newFormatMap == true) {
            try {
                formatMapDataService.Create(formatMap, selectedClient);
                newFormatMap = false;
                JOptionPane.showMessageDialog(new JFrame(), "Data saved");
            } catch (SQLException ex) {
                Logger.getLogger(ManageFormatsUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                formatMapDataService.Update(formatMap, selectedClient);
                JOptionPane.showMessageDialog(new JFrame(), "Data saved");
            } catch (SQLException ex) {
                Logger.getLogger(ManageFormatsUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void revertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revertButtonActionPerformed
        try {
            fetchFormatMapForSelectedClient();
        } catch (SQLException ex) {
            Logger.getLogger(ManageFormatsUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_revertButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new MainUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void clientSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientSelectActionPerformed
        try {
            fetchFormatMapForSelectedClient();
        } catch (SQLException ex) {
            Logger.getLogger(ManageFormatsUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clientSelectActionPerformed

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
            java.util.logging.Logger.getLogger(ManageFormatsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageFormatsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageFormatsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageFormatsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManageFormatsUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ManageFormatsUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agentIdColumnText;
    private javax.swing.JTextField amountColumnText;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField chargebackColumnText;
    private javax.swing.JComboBox<String> clientSelect;
    private javax.swing.JTextField commissionRateText;
    private javax.swing.JTextField customerAddressColumnText;
    private javax.swing.JTextField customerCityColumnText;
    private javax.swing.JTextField customerNameColumnText;
    private javax.swing.JTextField customerStateColumnText;
    private javax.swing.JTextField customerZipColumnText;
    private javax.swing.JTextField dateColumnText;
    private javax.swing.JTextField flex1ColumnText;
    private javax.swing.JTextField flex2ColumnText;
    private javax.swing.JTextField flex3ColumnText;
    private javax.swing.JTextField flex4ColumnText;
    private javax.swing.JTextField flex5ColumnText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField payableColumnText;
    private javax.swing.JButton revertButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField statusColumnText;
    private javax.swing.JTextField statusReasonColumnText;
    private javax.swing.JTextField usageColumnText;
    private javax.swing.JTextField utilityAcctNumberColumnText;
    private javax.swing.JTextField verificationNumberColumnText;
    // End of variables declaration//GEN-END:variables
}
