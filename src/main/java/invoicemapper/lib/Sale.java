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
public class Sale {
    private int id;
    private int invoiceId;

    private int agentId;
    private Date date;
    private String customerName;
    private String customerAddress;
    private String customerCity;
    private String customerState;
    private String customerZip;
    private String status;
    private String statusReason;
    private boolean payable;
    private boolean chargeback;
    private String usage;
    private String utilityAccountNumber;
    private String verificationNumber;
    private String flex1;
    private String flex2;
    private String flex3;
    private String flex4;
    private String flex5;
    private float amount;
}
