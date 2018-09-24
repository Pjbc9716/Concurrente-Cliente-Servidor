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
    IBN(10,0), IC(15,0);
    private final double cost;
    private int cant;

    private Impresion(double cost, int cant) {
        this.cost = cost;
        this.cant = cant;
    }
    public void setCant (int cant){
        this.cant = cant;
    }

    public double getCost() {
        if (this == IBN) {
            return this.cost * cant;
        } else if (this == IC) {
            return this.cost * cant;
        } else {
            return 0;
        }
    }
}
