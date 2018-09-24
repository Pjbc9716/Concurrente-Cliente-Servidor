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
    Diseno (20000,0,"");
    private final double cost;
    private int hour;
    private String type;

    private DisenoGrafico(double cost, int hour, String type) {
        this.cost = cost;
        this.hour = hour;
        this.type = type;
    }
    
    public void setInfo (int hour, String type){
        this.hour = hour;
        this.type = type;
    }
    
    public double getCost ( ){
        if (type.equals("Nuevo")){
            return this.cost*hour;
        }else if (type.equals("Usado")){
            return (this.cost*hour-(5000*hour));
        }else{
            return 0;
        }
        
    }
    
    
}
