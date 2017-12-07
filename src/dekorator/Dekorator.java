package dekorator;






public class Dekorator implements Komponenta {

    Komponenta komp;

    public Dekorator(Komponenta komp1) {
        komp = komp1;
    }

    public void prikaziMeni() {
        komp.prikaziMeni();
    }
    
}
