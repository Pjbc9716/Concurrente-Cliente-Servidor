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
public enum CorreccionOrtografica {
    CO(800);
    private final double cost;

    private CorreccionOrtografica(int cost) {
        this.cost = cost;
    }

    public double getCost(String tipo, int cant) {
        if (tipo.equals("Estudiante")) {
            return this.cost * cant - (cant * 150);
        } else if (tipo.equals("Revista")) {
            return this.cost * cant + (cant * 100);
        } else if (tipo.equals("N/A")) {
            return this.cost * cant;
        } else {
            return 0;
        }
    }

}
