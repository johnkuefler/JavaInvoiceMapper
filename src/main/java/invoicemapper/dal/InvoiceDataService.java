/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Client;
import invoicemapper.lib.Invoice;
import invoicemapper.lib.Sale;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author johnk
 */
public class InvoiceDataService extends DataService {
    
    public InvoiceDataService() {
        super();
    }
    
     public ArrayList<Invoice> GetAll() throws SQLException {
        ArrayList<Invoice> output = new ArrayList<Invoice>();
         
        PreparedStatement statement = super.getConnection().prepareStatement("SELECT ClientName, Date, Amount, Revenue FROM IM_Invoice");
        ResultSet resultSet = statement.executeQuery();
        
        while (resultSet.next())
        {
            Invoice invoice = new Invoice();
            invoice.setClientName(resultSet.getString(1));
            invoice.setDate(resultSet.getDate(2));
            invoice.setAmount(resultSet.getFloat(3));
            invoice.setRevenue(resultSet.getFloat(4));
            output.add(invoice);
        }

        return output;
    }
     
      public ArrayList<Invoice> GetByClient(String clientName) throws SQLException {
        ArrayList<Invoice> output = new ArrayList<Invoice>();
         
        PreparedStatement statement = super.getConnection().prepareStatement("SELECT ClientName, Date, Amount, Revenue FROM IM_Invoice WHERE ClientName = ?");
        statement.setString(1, clientName);
        ResultSet resultSet = statement.executeQuery();
        
        while (resultSet.next())
        {
            Invoice invoice = new Invoice();
            invoice.setClientName(resultSet.getString(1));
            invoice.setDate(resultSet.getDate(2));
            invoice.setAmount(resultSet.getFloat(3));
            invoice.setRevenue(resultSet.getFloat(4));
            output.add(invoice);
        }

        return output;
    }
     
    
    public void Create(Invoice newInvoice) throws SQLException {
        PreparedStatement statement = super.getConnection().prepareStatement("INSERT INTO IM_Invoice (ClientName, Date, Amount, Revenue) "
                + "VALUES (?,?,?,?)");
        statement.setString(1, newInvoice.getClientName());
        statement.setDate(2, new java.sql.Date(newInvoice.getDate().getTime()));
        statement.setFloat(3, newInvoice.getAmount());
        statement.setFloat(4, newInvoice.getRevenue());

        statement.executeUpdate();
    }
    
     public void UpdateRevenue(Date invoiceDate, String clientName, float revenue) throws SQLException {
        PreparedStatement statement = super.getConnection().prepareStatement("UPDATE IM_Invoice "
                + "SET Revenue = ? "
                + "WHERE Date = ? AND ClientName = ?");
        statement.setFloat(1, revenue);
        statement.setDate(2, new java.sql.Date(invoiceDate.getTime()));
        statement.setString(3, clientName);

        statement.executeUpdate();
    }
    
    public void Delete(Date invoiceDate, String clientName) throws SQLException {
      // todo: implement
    }
}