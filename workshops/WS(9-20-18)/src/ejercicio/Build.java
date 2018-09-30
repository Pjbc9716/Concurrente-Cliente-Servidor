package ejercicio;



public class Build {
    //variables con clases creadas por nosotros
    private final Impresion impresion;
    private final Fotocopia fotocopia; 
    private final Levantado levantado;
    private final CorreccionOrtografica correccion;
    private final DisenoGrafico diseno;
    
// cosntructor con parámetros
    public Build(Impresion impresion, Fotocopia fotocopia  , Levantado levantado, CorreccionOrtografica correccion, DisenoGrafico diseno) {
        this.impresion = impresion;
        this.fotocopia = fotocopia;
        this.levantado = levantado;
        this.correccion = correccion;
        this.diseno = diseno;
    }
    //método set con parámetros
    public void setInfo (int cantImpresion, int cantFotocopia, int cantLevantado, int cantCorreccion, String tipoCorreccion, int cantHours, String tipoDiseno   ){
        this.impresion.setCant(cantImpresion);// le pasamos la cantidad a impresion
        this.fotocopia.setCost(cantFotocopia);// le pasamos la cantidad a fotocopia
        this.levantado.setCant(cantLevantado);//cantidad a levantado
        this.correccion.setInfo(cantCorreccion,tipoCorreccion);//le pasamos la cantidad y el tipo
        this.diseno.setInfo(cantHours, tipoDiseno);// las horas y el tipo de diseño
        
    }

    // imprimir
    public String getPrintTotal() {
    
        return "Total a pagar: "+ (this.impresion.getCost()+ this.fotocopia.getCost() + this.levantado.getCost() + this.correccion.getCost()+this.diseno.getCost());
        
    }//imprime
    public String getPrintCost(){
        return "Costo por impresion: "+this.impresion.getCost()+"\nCostopor fotocopias: "+this.fotocopia.getCost()+"\nCosto por Levantado: "+this.levantado.getCost()
                +"\nCosto por Correccion: "+this.correccion.getCost()+"\nCosto por Diseno: "+this.diseno.getCost();
        
    }

}
