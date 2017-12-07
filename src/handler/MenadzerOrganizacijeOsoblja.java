/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;


public class MenadzerOrganizacijeOsoblja extends ZaposleniAgencijeOrganizacione{
 
   public MenadzerOrganizacijeOsoblja(ZaposleniAgencijeOrganizacione zao1) {
   
     super(zao1);
    }

    

@Override
    protected String vratiSvojePodatke() {
   
     return " Menadzer sektora za organizaciju usluznog osoblja: Marina Boljanac\nKontakt telefon: 064/456 78 77\nOkvirna cena: 18.000,00 dinara";
    }
}
