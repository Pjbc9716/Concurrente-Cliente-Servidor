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
public class Contact {

    private String tipo;
    private String nombre;
    private String correo;
    private String phone;

    public Contact(final String tipo,final String nombre, final String correo, final String phone) {
        this.nombre = nombre;
        this.correo = correo;
        this.phone = phone;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "-> Contact info: " + "\n*Tipo de CLiente= " + tipo + "\n*Nombre=" + nombre + "\n*Correo=" + correo + "\n*Phone=" + phone + " ";
    }

}
