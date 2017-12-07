/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formati;

import obroci.Meni;


public abstract class FormatMenia {

    Meni elementimeni;

    public void poveziSaMeniem(Meni elementimeni) {
        this.elementimeni = elementimeni;
    }

    abstract public String vratiFormatMenia();
}
