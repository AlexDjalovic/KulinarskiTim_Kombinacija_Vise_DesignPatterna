/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osnovni;

import dekorator.PricaItalijanskaKuhinja;
import formati.*;
import handler.*;



public class Main {

	public static void main(String[] args) {

		Klijent klijent;

		MenadzerOrganizacijeProstora mop = new MenadzerOrganizacijeProstora(null);
		MenadzerOrganizacijeOsoblja moo = new MenadzerOrganizacijeOsoblja(mop);

		// kreiranje manija italijanske kuhinje standardnog formata

		FormatMenia fm1 = null;
		fm1 = new StandardniFormat();
		KulinarskiTimRoma ktroma = new KulinarskiTimRoma(fm1);
		KulinarskiTimItaliano ktitaliano = new KulinarskiTimItaliano(ktroma, moo);

		klijent = new Klijent(ktitaliano);
		klijent.Konstruisi();
		PricaItalijanskaKuhinja itprica = new PricaItalijanskaKuhinja(klijent);
		itprica.prikaziMeni();
		System.out.println("\n--------------------------------------------------\n");

		// kreiranje manija italijanske kuhinje obrnutog formata za Japance

		FormatMenia fm2 = null;
		fm2 = new ObrnutiFormat();
		KulinarskiTimRoma ktroma2 = new KulinarskiTimRoma(fm2);
		KulinarskiTimItaliano ktitaliano2 = new KulinarskiTimItaliano(ktroma2, null);
		klijent = new Klijent(ktitaliano2);
		klijent.Konstruisi();

		PricaItalijanskaKuhinja itprica2 = new PricaItalijanskaKuhinja(klijent);
		itprica2.prikaziMeni();

	}
}
