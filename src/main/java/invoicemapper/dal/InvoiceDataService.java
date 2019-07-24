/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Invoice;
import invoicemapper.lib.Sale;
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
    
    public ArrayList<Invoice> GetByDateRange(Date startDate, Date endDate) throws SQLException {
         // todo: implement
        return null;
    }
    
     public ArrayList<Invoice> GetAll() throws SQLException {
         // todo: implement
        return null;
    }
    
    public Invoice Create(Invoice newSale) throws SQLException {
      // todo: implement
        return null;
    }
    
    public Invoice Update(Invoice sqleToUpdate) throws SQLException {
      // todo: implement
        return null;
    }
     
    public void Delete(int saleId) throws SQLException {
      // todo: implement
    }
}