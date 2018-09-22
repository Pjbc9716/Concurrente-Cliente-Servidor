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
    PC(150), MP(100);
    private final double cost;

    private Levantado(double cost) {
        this.cost = cost;
    }

    public double getCost(int cant) {
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
