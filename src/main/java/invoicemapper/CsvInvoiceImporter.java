/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper;

import invoicemapper.lib.FormatMap;
import invoicemapper.lib.Invoice;
import invoicemapper.lib.Sale;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author johnk
 */
public class CsvInvoiceImporter {
    private FormatMap formatMap;
    
    public CsvInvoiceImporter(FormatMap formatMap) {
        this.formatMap = formatMap;
    }
    
    public ArrayList<Sale> ImportSalesForInvoice(Invoice invoice, String csvPath) throws FileNotFoundException, ParseException {
        ArrayList<Sale> output = new ArrayList<Sale>();
        
        Scanner scanner = new Scanner(new File(csvPath));
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            String[] rowValues = scanner.next().split(",");
            
            Sale sale = new Sale();
            sale.setAgentId(Integer.parseInt(rowValues[this.formatMap.getAgentIdColumn()]));
            sale.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(rowValues[this.formatMap.getDateColumn()]));
            sale.setCustomerName(rowValues[this.formatMap.getCustomerNameColumn()]);
            sale.setCustomerAddress(rowValues[this.formatMap.getCustomerAddressColumn()]);
            sale.setCustomerCity(rowValues[this.formatMap.getCustomerCityColumn()]);
            sale.setCustomerState(rowValues[this.formatMap.getCustomerStateColumn()]);
            sale.setStatus(rowValues[this.formatMap.getStatusColumn()]);
            sale.setStatusReason(rowValues[this.formatMap.getStatusReasonColumn()]);
            sale.setPayable(Boolean.parseBoolean(rowValues[this.formatMap.getPayableColumn()]));
            sale.setChargeback(Boolean.parseBoolean(rowValues[this.formatMap.getChargebackColumn()]));
            sale.setUsage(rowValues[this.formatMap.getUsageColumn()]);
            sale.setUtilityAccountNumber(rowValues[this.formatMap.getUtilityAccountNumberColumn()]);
            sale.setVerificationNumber(rowValues[this.formatMap.getVerificationNumberColumn()]);
            sale.setFlex1(rowValues[this.formatMap.getFlex1Column()]);
            sale.setFlex2(rowValues[this.formatMap.getFlex2Column()]);
            sale.setFlex3(rowValues[this.formatMap.getFlex3Column()]);
            sale.setFlex4(rowValues[this.formatMap.getFlex4Column()]);
            sale.setFlex5(rowValues[this.formatMap.getFlex5Column()]);
            sale.setAmount(Float.parseFloat(rowValues[this.formatMap.getAmountColumn()]));

            output.add(sale);
        }
        
        return output;
    }
    
}
