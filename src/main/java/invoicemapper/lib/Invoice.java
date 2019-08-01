/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.lib;

import java.util.Date;

/**
 *
 * @author johnk
 */
public class Invoice {
    private String clientName;
    private Date date;
    private float amount;
    private float revenue;
    
   
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    public float getRevenue() {
        return revenue;
    }
    
    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
