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

        build = new Build(Impresion.IBN, 0, Fotocopia.FC, 0, Levantado.MP, -1, CorreccionOrtografica.CO, "Estudiante", 0, DisenoGrafico.Diseno, 0, "Nuevo");

        System.out.println(build.getPrintCost()+"\n--------------------\n"+build.getPrintTotal());
    }

}
