/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4_progra;
/**
 *
 * @author Denis Ugalde Meza
 */
public class Rectangulo {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
     
    public double calcular(){
        return largo * ancho;
    }
    
    public String elemento(){
        return "El área del rectángulo es: ";
    }
}
    

