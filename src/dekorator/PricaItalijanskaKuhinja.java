package dekorator;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class PricaItalijanskaKuhinja extends Dekorator {

    public PricaItalijanskaKuhinja(Komponenta komp1) {
        super(komp1);
    }

    public void prikaziMeni() {
        super.prikaziMeni();
        System.out.println("\nItalijanska kuhinja jeste jedna od najpopularnijih, ali i jedna od najpoznatijih kuhinja u svetu.\nItalijani vole da prilikom kuvanja koriste sezonsko voce i povrce pa se svaki ovaj segment njihove kuhinje znatno menja sa promenom godišnjeg doba.\n ");
    }
}
