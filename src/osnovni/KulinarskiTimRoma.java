/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osnovni;

import obroci.*;

import formati.FormatMenia;


public class KulinarskiTimRoma implements KeteringTim {

 
   Meni elementimeni;
   
 FormatMenia fm;

    
public KulinarskiTimRoma(FormatMenia fm) {
        
	elementimeni = new Meni();
        
	this.fm = fm;
       	
	 this.fm.poveziSaMeniem(elementimeni);
    }

  
  public void kreirajPredjelo() {
        elementimeni.setPredjelo(new SkampiSaBademom());
    }

 
   public void kreirajGlavnoJelo() {
        elementimeni.setGlavnojelo(new Pica());

    }

  
  public void kreirajDezert() {
        elementimeni.setDezert(new Sladoled());
    }

  
  public String vratiMeni() {
        return fm.vratiFormatMenia();

    }
}
