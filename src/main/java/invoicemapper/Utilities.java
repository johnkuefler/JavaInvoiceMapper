/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper;

/**
 *
 * @author johnk
 */
public class Utilities {
    public static boolean ParseBool(String input) {
        if (input.equalsIgnoreCase("yes")) {
            return true;
        }
        else {
            return false;
        }
    }
}
