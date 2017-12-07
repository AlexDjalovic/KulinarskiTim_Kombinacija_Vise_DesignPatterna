/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formati;

import formati.FormatMenia;


public class StandardniFormat extends FormatMenia {

    public String vratiFormatMenia() {
        return " Meni se sastoji iz: \n Predjelo - "
                + elementimeni.getPredjelo().vratiPredjelo()
                + " \n Glavno jelo - "
                + elementimeni.getGlavnojelo().vratiGlavnoJelo()
                + " \n Dezert -"
                + elementimeni.getDezert().vratiDezert();
    }
}
