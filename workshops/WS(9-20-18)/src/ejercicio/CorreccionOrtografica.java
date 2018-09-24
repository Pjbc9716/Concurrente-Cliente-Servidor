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
    CO(800, 0, "");
    private final double cost;
    private double cant;
    private String type;

    private CorreccionOrtografica(double cost, double cant, String type) {
        this.cost = cost;
        this.cant = cant;
        this.type = type;
    }

    public void setInfo(double cant, String type) {
        this.cant = cant;
        this.type = type;
    }

    public double getCost() {
        if (type.equals("Estudiante")) {
            return this.cost * cant - (cant * 150);
        } else if (type.equals("Revista")) {
            return this.cost * cant + (cant * 100);
        } else if (type.equals("N/A")) {
            return this.cost * cant;
        } else {
            return 0;
        }
    }

}
