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
public class Empresa extends Contact {

    private String direccion;
    private String fax;
    private int cantBurrito;
    private int cantPizza;

    public Empresa(String direccion, String fax, String tipo, String nombre, String correo, String phone, int cantBurrito, int cantPizza) {
        super(tipo, nombre, correo, phone);
        this.direccion = direccion;
        this.fax = fax;
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
    
    
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return super.toString() + " direccion: " + this.direccion + " fax: " + this.fax;
    }

 
           
}
