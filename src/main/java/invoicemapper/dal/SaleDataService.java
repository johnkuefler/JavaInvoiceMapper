/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Sale;
import java.sql.Connection;
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
    
    public Sale Create(Sale newSale) throws SQLException {
      // todo: implement
        return null;
    }
    
    public Sale Update(Sale sqleToUpdate) throws SQLException {
      // todo: implement
        return null;
    }
     
    public void Delete(int saleId) throws SQLException {
      // todo: implement
    }
}
