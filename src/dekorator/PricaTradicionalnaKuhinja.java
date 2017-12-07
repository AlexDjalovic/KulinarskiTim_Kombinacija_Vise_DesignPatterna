/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;


public class PricaTradicionalnaKuhinja extends Dekorator {

    public PricaTradicionalnaKuhinja(Komponenta komp1) {
        super(komp1);
    }

    public void prikaziMeni() {
        super.prikaziMeni();
        System.out.println("*\n Tradicionalna domaca kuhinja je..........................\n");
    }
}
