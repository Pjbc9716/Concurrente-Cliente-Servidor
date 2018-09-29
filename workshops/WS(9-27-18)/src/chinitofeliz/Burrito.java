/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinitofeliz;

/**
 *
 * @author ulacit
 */
public class Burrito {

    private String salsa;
    private String carne;
    private String queso;
    private String lechuga;
    private String tortilla;
    private String aguacate;
    private int cant;

    public Burrito(int cant) {
        this.cant = cant;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
}