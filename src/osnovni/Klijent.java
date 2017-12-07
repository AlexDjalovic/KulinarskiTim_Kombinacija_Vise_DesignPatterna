/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osnovni;

import dekorator.Komponenta;


public class Klijent implements Komponenta {

   
 KeteringTim ktim;

  
  public Klijent(KeteringTim ktim) {
        this.ktim = ktim;
    }

    
void Konstruisi() {

     
   ktim.kreirajPredjelo();
      
  ktim.kreirajGlavnoJelo();
      
  ktim.kreirajDezert();
    }

    

public void prikaziMeni() {
        System.out.println(ktim.vratiMeni());
    }
}
