/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.lib;

import javax.swing.JOptionPane;

/**
 *
 * @author johnk
 */
public class Client {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 50){
            JOptionPane.showMessageDialog(null,"Please enter a client name with less than 50 characters");
        }
        else{
        this.name = name;
    }
    }
}
