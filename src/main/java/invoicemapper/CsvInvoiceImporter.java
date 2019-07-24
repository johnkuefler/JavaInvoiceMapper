/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper;

import invoicemapper.lib.FormatMap;
import invoicemapper.lib.Invoice;
import invoicemapper.lib.Sale;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class CsvInvoiceImporter {
    private FormatMap formatMap;
    
    public CsvInvoiceImporter(FormatMap formatMap) {
        this.formatMap = formatMap;
    }
    
    public ArrayList<Sale> ImportSalesForInvoice(Invoice invoice, String salesCsv) {
        ArrayList<Sale> output = new ArrayList<Sale>();
        
        
        
        return output;
    }
    
}
