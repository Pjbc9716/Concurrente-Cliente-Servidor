
package chinitofeliz;


public class Person extends Contact {
    private String apellido;
    private int cantBurrito;
    private int cantPizza;

    public Person(String apellido, String tipo, String nombre, String correo, String phone,int cantBurrito, int cantPizza) {
        super(tipo, nombre, correo, phone);
        this.apellido = apellido;
        this.cantBurrito = cantBurrito;
        this.cantPizza = cantPizza;
    }

    public int getCantBurrito() {
        return cantBurrito;
    }

    public void setCantBurrito(int cantBurrito) {
        this.cantBurrito = cantBurrito;
    }

    public int getCantPizza() {
        return cantPizza;
    }

    public void setCantPizza(int cantPizza) {
        this.cantPizza = cantPizza;
    }

  

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public String toStringP() {
        return super.toString()+ "\n*Apellido: " + apellido ;
    }
    
    
    
    
    
}

