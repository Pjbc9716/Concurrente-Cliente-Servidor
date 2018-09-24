/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author PJ129
 */
public enum Levantado {
    PC(150,0), MP(100,0);
    private final double cost;
    private int cant;

    private Levantado(double cost, int cant) {
        this.cost = cost;
        this.cant = cant;
    }
    public void setCant (int cant){
        this.cant = cant;
    }
    public double getCost() {
        if (cant <500) {
            if (this == PC) {
                return this.cost * cant;
            } else if (this == MP) {
                return this.cost * cant;
            } else {
                return 0;
            }
        } else if (cant >= 500) {
            if (this == PC) {
                return ((this.cost * cant) - (130 * cant));
            } else if (this == MP) {
                return ((this.cost * cant) - (130 * cant));
            } else {
                return 0;
            }
        }else{
            return 0;
        }
    }

}
