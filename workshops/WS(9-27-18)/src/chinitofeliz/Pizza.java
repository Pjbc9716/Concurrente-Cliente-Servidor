
package chinitofeliz;

public class Pizza {
   //ingredientes
    private String salsa;
    private String carnes;
    private String olores;
    private String queso;
    private String pasta;
    private int cant;
    //cosntructor
    public Pizza(int cant) {
        this.cant = cant;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    
    public String toStringPizza() {
        return "Pizza ingredientes :" + "salsa = " + salsa + ", carnes = " + carnes + ", olores = " + olores + ", queso = " + queso + ", pasta = " + pasta + ", cant = " + cant + "pizza(s)";
    }
    

}
