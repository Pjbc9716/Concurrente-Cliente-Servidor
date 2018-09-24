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
    FBN(10,0), FC(15,0);
    private final double cost;
    private int cant;
    private Fotocopia(double cost, int cant) {
        this.cost = cost;
        this.cant = cant;
    }
//    
    public void setCost(int cant){
        this.cant= cant;
    }

    public double getCost() {
        if (this == FBN) {
            return this.cost * cant;
        } else if (this == FC) {
            return this.cost * cant;
        } else {
            return 0;
        }
    }

}
