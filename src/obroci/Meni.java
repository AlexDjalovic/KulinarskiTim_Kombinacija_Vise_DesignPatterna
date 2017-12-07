/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package obroci;


public class Meni {

    private Predjelo predjelo;
    private GlavnoJelo glavnojelo;
    private Dezert dezert;

    public Dezert getDezert() {
        return dezert;
    }

    public GlavnoJelo getGlavnojelo() {
        return glavnojelo;
    }

    public Predjelo getPredjelo() {
        return predjelo;
    }

    public void setDezert(Dezert dezert) {
        this.dezert = dezert;
    }

    public void setGlavnojelo(GlavnoJelo glavnojelo) {
        this.glavnojelo = glavnojelo;
    }

    public void setPredjelo(Predjelo predjelo) {
        this.predjelo = predjelo;
    }
}
