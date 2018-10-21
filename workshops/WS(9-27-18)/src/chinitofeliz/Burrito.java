
package chinitofeliz;

public class Burrito {

    private String salsa;
    private String carne;
    private String queso;
    private String lechuga;
    private String tortilla;
    private String aguacate;
    private int cant;

    public Burrito(int cant) {
        this.cant = cant;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

   
    public String toStringBurrito() {
        return "Burrito ingredientes :" + "salsa = " + salsa + ", carne = " + carne + ", queso = " + queso + ", lechuga = " + lechuga + ", tortilla = " + tortilla + ", aguacate=" + aguacate + ", cant = " + cant+" Burrito(s)" ;
    }
    
    
    
}
