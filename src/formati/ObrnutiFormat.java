/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formati;

public class ObrnutiFormat extends FormatMenia {

    public String vratiFormatMenia() {
        return " Meni se sastoji iz: \n Dezert - "
                + elementimeni.getDezert().vratiDezert()
                + " \n Glavno jelo - "
                + elementimeni.getGlavnojelo().vratiGlavnoJelo()
                + " \n Predjelo -"
                + elementimeni.getPredjelo().vratiPredjelo();
    }
}
