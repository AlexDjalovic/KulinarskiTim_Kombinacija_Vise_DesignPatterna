/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;




public abstract class ZaposleniAgencijeOrganizacione {

   
 private ZaposleniAgencijeOrganizacione zao;

    

public ZaposleniAgencijeOrganizacione(ZaposleniAgencijeOrganizacione zao) {
     
   this.zao = zao;
    }

   

 public String vratiPodatke() {
      
  String podaci = "";
       
 podaci = "\n" + vratiSvojePodatke();
   
     if (this.zao != null) {
 podaci = zao.vratiPodatke() + podaci;
}
       
 return podaci;
    }

  

  protected abstract String vratiSvojePodatke();
}
