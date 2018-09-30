/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinitofeliz;

/**
 *
 * @author ulacit
 */
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

    @Override
    public String toString() {
        return super.toString()+ "\n*Apellido: " + apellido ;
    }
    
    
    
    
    
}
