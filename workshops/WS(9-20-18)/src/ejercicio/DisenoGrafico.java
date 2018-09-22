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
public enum DisenoGrafico {
    Diseno (20000);
    private final double cost;

    private DisenoGrafico(double cost) {
        this.cost = cost;
    }
    
    public double getCost (int horas, String diseno ){
        if (diseno.equals("Nuevo")){
            return this.cost*horas;
        }else if (diseno.equals("Usado")){
            return (this.cost*horas-(5000*horas));
        }else{
            return 0;
        }
        
    }
    
    
}
