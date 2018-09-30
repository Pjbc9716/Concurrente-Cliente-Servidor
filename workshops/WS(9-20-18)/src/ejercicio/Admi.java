
package ejercicio;


public class Admi {
    
    private Build build;
    //constructor vacío
    public Admi() {
    }
    
    public void newObject() {
   // lo instanciamos y le pasamos los parámetros
        build = new Build(Impresion.IC, Fotocopia.FBN, Levantado.MP,CorreccionOrtografica.CO, DisenoGrafico.Diseno);
        // le pasamos datos al método setinf de la clase build 
        build.setInfo(1, 1, 65, 434, "Estudiante", 500, "Usado");
        //imprimir datos con el método get print
        System.out.println(build.getPrintCost()+"\n--------------------\n"+build.getPrintTotal());
    }

}
