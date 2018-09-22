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
public enum Impresion {
    IBN(10), IC(15);
    private final double cost;

    private Impresion(double cost) {
        this.cost = cost;
    }

    public double getCost(double cant) {
        if (this == IBN) {
            return this.cost * cant;
        } else if (this == IC) {
            return this.cost * cant;
        } else {
            return 0;
        }
    }

}
