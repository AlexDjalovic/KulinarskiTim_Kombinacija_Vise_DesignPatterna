package osnovni;

import handler.ZaposleniAgencijeOrganizacione;

public class KulinarskiTimItaliano implements KeteringTim {

   
 private KulinarskiTimRoma ktroma;
  
  private ZaposleniAgencijeOrganizacione zao;

   
 public KulinarskiTimItaliano(KulinarskiTimRoma ktroma, ZaposleniAgencijeOrganizacione zao) {

        this.ktroma = ktroma;
        
this.zao = zao;
    }

    
public void kreirajPredjelo() {
        ktroma.kreirajPredjelo();
    }

    
public void kreirajGlavnoJelo() {
        ktroma.kreirajGlavnoJelo();

    }

   
 public void kreirajDezert() {
        ktroma.kreirajDezert();
    }

  

  public String vratiMeni() {
    
    if (zao != null) {
  return "**************************************"
 + zao.vratiPodatke() + 
"\n*********************************************\n\n" + ktroma.vratiMeni();
       
 } else {
            return ktroma.vratiMeni();
        }
    }
}
