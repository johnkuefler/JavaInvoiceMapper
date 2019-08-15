/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Sale;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class SaleDataService extends DataService {
    
    public SaleDataService() {
        super();
    }
    
    public ArrayList<Sale> GetByInvoiceId(int invoiceId) throws SQLException {
         // todo: implement
        return null;
    }
    
    public void Create(Sale newSale) throws SQLException {
        PreparedStatement statement = super.getConnection().prepareStatement("INSERT INTO IM_Sale ("+
                "InvoiceDate, " +
                "ClientName, " +
                "AgentId, " +
                "Date, " +
                "CustomerName, " +
                "CustomerAddress, " +
                "CustomerCity, " +
                "CustomerState, " +
                "CustomerZip, " +
                "Status, " +
                "StatusReason, " +
                "Payable, " +
                "Chargeback, " +
                "Usage, " +
                "UtilityAccountNumber, " +
                "VerificationNumber, " +
                "Flex1, " +
                "Flex2, " +
                "Flex3, " +
                "Flex4, " +
                "Flex5, " +
                "Amount, " +
                "Commission " +
                ") "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        statement.setDate(1, new java.sql.Date(newSale.getInvoiceDate().getTime()));
        statement.setString(2, newSale.getClientName());
        statement.setString(3, newSale.getAgentId());
        statement.setDate(4, new java.sql.Date(newSale.getDate().getTime()));
        statement.setString(5, newSale.getCustomerName());
        statement.setString(6, newSale.getCustomerAddress());
        statement.setString(7, newSale.getCustomerCity());
        statement.setString(8, newSale.getCustomerState());
        statement.setString(9, newSale.getCustomerZip());
        statement.setString(10, newSale.getStatus());
        statement.setString(11, newSale.getStatusReason());
        statement.setBoolean(12, newSale.isPayable());
        statement.setBoolean(13, newSale.isChargeback());
        statement.setString(14, newSale.getUsage());
        statement.setString(15, newSale.getUtilityAccountNumber());
        statement.setString(16, newSale.getVerificationNumber());
        statement.setString(17, newSale.getFlex1());
        statement.setString(18, newSale.getFlex2());
        statement.setString(19, newSale.getFlex3());
        statement.setString(20, newSale.getFlex4());
        statement.setString(21, newSale.getFlex5());
        statement.setFloat(22, newSale.getAmount());
        statement.setFloat(23, newSale.getCommission());

        statement.executeUpdate();
    }
    
    public void Update(Sale saleToUpdate) throws SQLException {
        PreparedStatement statement = super.getConnection().prepareStatement("UPDATE IM_Sale SET "+
                "InvoiceDate=?, " +
                "ClientName=?, " +
                "AgentId=?, " +
                "Date=?, " +
                "CustomerName=?, " +
                "CustomerAddress=?, " +
                "CustomerCity=?, " +
                "CustomerState=?, " +
                "CustomerZip=?, " +
                "Status=?, " +
                "StatusReason=?, " +
                "Payable=?, " +
                "Chargeback=?, " +
                "Usage=?, " +
                "UtilityAccountNumber=?, " +
                "Flex1=?, " +
                "Flex2=?, " +
                "Flex3=?, " +
                "Flex4=?, " +
                "Flex5=?, " +
                "Amount=?, " +
                "Commission=? " +
                ") "
                + "WHERE VerificationNumber = ?");
        statement.setDate(1, new java.sql.Date(saleToUpdate.getInvoiceDate().getTime()));
        statement.setString(2, saleToUpdate.getClientName());
        statement.setString(3, saleToUpdate.getAgentId());
        statement.setDate(4, new java.sql.Date(saleToUpdate.getDate().getTime()));
        statement.setString(5, saleToUpdate.getCustomerName());
        statement.setString(6, saleToUpdate.getCustomerAddress());
        statement.setString(7, saleToUpdate.getCustomerCity());
        statement.setString(8, saleToUpdate.getCustomerState());
        statement.setString(9, saleToUpdate.getCustomerZip());
        statement.setString(10, saleToUpdate.getStatus());
        statement.setString(11, saleToUpdate.getStatusReason());
        statement.setBoolean(12, saleToUpdate.isPayable());
        statement.setBoolean(13, saleToUpdate.isChargeback());
        statement.setString(14, saleToUpdate.getUsage());
        statement.setString(15, saleToUpdate.getUtilityAccountNumber());
        statement.setString(16, saleToUpdate.getFlex1());
        statement.setString(17, saleToUpdate.getFlex2());
        statement.setString(18, saleToUpdate.getFlex3());
        statement.setString(19, saleToUpdate.getFlex4());
        statement.setString(20, saleToUpdate.getFlex5());
        statement.setFloat(21, saleToUpdate.getAmount());
        statement.setFloat(22, saleToUpdate.getCommission());
                statement.setString(23, saleToUpdate.getVerificationNumber());


        statement.executeUpdate();
    }
     
    public void Delete(int saleId) throws SQLException {
      // todo: implement
    }
}
