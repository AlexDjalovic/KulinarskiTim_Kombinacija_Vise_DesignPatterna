/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;


public class MenadzerOrganizacijeProstora extends ZaposleniAgencijeOrganizacione {

 
   public MenadzerOrganizacijeProstora(ZaposleniAgencijeOrganizacione zao1) {
 
       super(zao1);
    }

   
 @Override
    protected String vratiSvojePodatke() {
    
    return " Menadzer sektora za organizaciju prostora: Milan Rakic\nKontakt telefon: 064/456 78 88\nOkvirna cena: 20.000,00 dinara";
    }
}
