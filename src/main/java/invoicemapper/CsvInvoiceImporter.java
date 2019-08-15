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

        int rowCounter = 0;
        while (scanner.hasNext()) {
            // skip header row
            if (rowCounter == 0) {
                rowCounter++;
                continue;
            } else {            
                rowCounter++;
            }

            String[] rowValues = scanner.next().split(",");

            Sale sale = new Sale();
            sale.setInvoiceDate(invoice.getDate());
            sale.setClientName(invoice.getClientName());

            sale.setAgentId((rowValues[this.formatMap.getAgentIdColumn()]));          
            sale.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(rowValues[this.formatMap.getDateColumn()]));
            sale.setCustomerName(rowValues[this.formatMap.getCustomerNameColumn()]);
            sale.setCustomerAddress(rowValues[this.formatMap.getCustomerAddressColumn()]);
            sale.setCustomerCity(rowValues[this.formatMap.getCustomerCityColumn()]);
            sale.setCustomerState(rowValues[this.formatMap.getCustomerStateColumn()]);
            sale.setCustomerZip(rowValues[this.formatMap.getCustomerZipColumn()]);
            sale.setStatus(rowValues[this.formatMap.getStatusColumn()]);
            sale.setStatusReason(rowValues[this.formatMap.getStatusReasonColumn()]);
            sale.setPayable(Utilities.ParseBool(rowValues[this.formatMap.getPayableColumn()]));
            sale.setChargeback(Utilities.ParseBool(rowValues[this.formatMap.getChargebackColumn()]));
            sale.setUsage(rowValues[this.formatMap.getUsageColumn()]);
            sale.setUtilityAccountNumber(rowValues[this.formatMap.getUtilityAccountNumberColumn()]);
            sale.setVerificationNumber(rowValues[this.formatMap.getVerificationNumberColumn()]);

            // flex columns are optional - if they are mapped to 999 we just set these values to empty
            if (this.formatMap.getFlex1Column() != 999) {
                sale.setFlex1(rowValues[this.formatMap.getFlex1Column()]);
            } else {
                sale.setFlex1("");
            }
            if (this.formatMap.getFlex2Column() != 999) {
                sale.setFlex2(rowValues[this.formatMap.getFlex2Column()]);
            } else {
                sale.setFlex2("");
            }
            if (this.formatMap.getFlex3Column() != 999) {
                sale.setFlex3(rowValues[this.formatMap.getFlex3Column()]);
            } else {
                sale.setFlex3("");
            }
            if (this.formatMap.getFlex4Column() != 999) {
                sale.setFlex4(rowValues[this.formatMap.getFlex4Column()]);
            } else {
                sale.setFlex4("");
            }
            if (this.formatMap.getFlex5Column() != 999) {
                sale.setFlex5(rowValues[this.formatMap.getFlex5Column()]);
            } else {
                sale.setFlex5("");
            }
            sale.setAmount(Float.parseFloat(rowValues[this.formatMap.getAmountColumn()]));

            output.add(sale);
        }

        return output;
    }
}
