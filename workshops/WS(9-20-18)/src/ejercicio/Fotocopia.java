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
public enum Fotocopia {
    FBN(10), FC(15);
    private final double cost;

    private Fotocopia(double cost) {
        this.cost = cost;
    }

    public double getCost(int cant) {
        if (this == FBN) {
            return this.cost * cant;
        } else if (this == FC) {
            return this.cost * cant;
        } else {
            return 0;
        }
    }

}
