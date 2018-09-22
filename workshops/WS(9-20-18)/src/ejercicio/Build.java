/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

/**
 *
 * @author PJ129
 */
public class Build {

    private final Impresion tipoImpresion;
    private int cantidadImpresion =0;
    private final Fotocopia tipoFotocopia; 
    private  int cantidadFotocopia =0;
    private final Levantado tipoLevantado;
    private  int cantidadLevantado =0;
    private final CorreccionOrtografica tipoCorreccion;
    private  int cantidadCorreccion =0;
    private final DisenoGrafico tipoDiseno;
    private  int cantidadHoras =0;
    private String tipoCliente ="";
    private String diseno ="";
    

    public Build(Impresion tipoImpresion, int cantidadImpresion , Fotocopia tipoFotocopia, int cantidadFotocopia , Levantado tipoLevantado, int cantidadLevantado ,CorreccionOrtografica tipoCorreccion, String tipoCliente ,int cantidadCorreccion ,DisenoGrafico tipoDiseno, int cantidadHoras, String diseno) {
        this.tipoImpresion = tipoImpresion;
        this.tipoFotocopia = tipoFotocopia;
        this.tipoLevantado = tipoLevantado;
        this.tipoCorreccion = tipoCorreccion;
        this.tipoDiseno = tipoDiseno;
        this.cantidadImpresion = cantidadImpresion;
        this.cantidadFotocopia = cantidadFotocopia;
        this.cantidadLevantado = cantidadLevantado;
        this.cantidadCorreccion = cantidadCorreccion;
        this.cantidadHoras = cantidadHoras; 
        this.tipoCliente = tipoCliente;
        this.diseno = diseno;
    }

    
    public String getPrintTotal() {
        return "Total a pagar: "+ (this.tipoImpresion.getCost(this.cantidadImpresion)+ this.tipoFotocopia.getCost(this.cantidadFotocopia) + this.tipoLevantado.getCost(this.cantidadLevantado) + this.tipoCorreccion.getCost(this.tipoCliente, this.cantidadCorreccion)+this.tipoDiseno.getCost(this.cantidadHoras, this.diseno));
        
    }
    public String getPrintCost(){
        return "Costo por impresion: "+this.tipoImpresion.getCost(this.cantidadImpresion)+"\nCostopor fotocopias: "+this.tipoFotocopia.getCost(this.cantidadFotocopia)+"\nCosto por Levantado: "+this.tipoLevantado.getCost(this.cantidadLevantado)
                +"\nCosto por Correccion: "+this.tipoCorreccion.getCost(this.tipoCliente, this.cantidadCorreccion)+"\nCosto por Diseno: "+this.tipoDiseno.getCost(this.cantidadHoras, this.diseno);
        
    }

}
