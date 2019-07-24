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
    private int id;
    private Date date;
    private float amount;
    private Client client;
}
