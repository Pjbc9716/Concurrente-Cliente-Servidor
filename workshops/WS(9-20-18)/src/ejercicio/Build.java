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
public class Build {

    private final Impresion impresion;
    private final Fotocopia fotocopia; 
    private final Levantado levantado;
    private final CorreccionOrtografica correccion;
    private final DisenoGrafico diseno;
    

    public Build(Impresion impresion, Fotocopia fotocopia  , Levantado levantado, CorreccionOrtografica correccion, DisenoGrafico diseno) {
        this.impresion = impresion;
        this.fotocopia = fotocopia;
        this.levantado = levantado;
        this.correccion = correccion;
        this.diseno = diseno;
    }
    
    public void setInfo (int cantImpresion, int cantFotocopia, int cantLevantado, int cantCorreccion, String tipoCorreccion, int cantHours, String tipoDiseno   ){
        this.impresion.setCant(cantImpresion);
        this.fotocopia.setCost(cantFotocopia);
        this.levantado.setCant(cantLevantado);
        this.correccion.setInfo(cantCorreccion,tipoCorreccion);
        this.diseno.setInfo(cantHours, tipoDiseno);
        
    }

    
    public String getPrintTotal() {
    
        return "Total a pagar: "+ (this.impresion.getCost()+ this.fotocopia.getCost() + this.levantado.getCost() + this.correccion.getCost()+this.diseno.getCost());
        
    }
    public String getPrintCost(){
        return "Costo por impresion: "+this.impresion.getCost()+"\nCostopor fotocopias: "+this.fotocopia.getCost()+"\nCosto por Levantado: "+this.levantado.getCost()
                +"\nCosto por Correccion: "+this.correccion.getCost()+"\nCosto por Diseno: "+this.diseno.getCost();
        
    }

}
