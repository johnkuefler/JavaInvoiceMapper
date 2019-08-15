/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper;

import invoicemapper.lib.Sale;

/**
 *
 * @author johnk
 */
public class CommissionCalculator {

    private float commissionRate;
    private Sale sale;

    public CommissionCalculator(float commissionRate, Sale sale) {
        this.commissionRate = commissionRate;
        this.sale = sale;
    }

    public float getCommissionAmount() {
        if (sale.isChargeback()) {
            return (sale.getAmount() * commissionRate) * -1;
        } else {
            if (sale.isPayable()) {
                return sale.getAmount() * commissionRate;
            } else {
                return 0;
            }
        }
    }
}
