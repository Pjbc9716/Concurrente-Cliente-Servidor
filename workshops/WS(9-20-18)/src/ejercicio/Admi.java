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
public class Admi {
    
    private Build build;
    
    public Admi() {
    }
    
    public void newObject() {

        build = new Build(Impresion.IC, Fotocopia.FBN, Levantado.MP,CorreccionOrtografica.CO, DisenoGrafico.Diseno);
        
        build.setInfo(1, 1, 65, 434, "Estudiante", 500, "Usado");

        System.out.println(build.getPrintCost()+"\n--------------------\n"+build.getPrintTotal());
    }

}
