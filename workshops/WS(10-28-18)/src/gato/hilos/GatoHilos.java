/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato.hilos;

/**
 *
 * @author PJ129
 */
public class GatoHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consola consola = new Consola();
        consola.fillConsole();
        Control control = new Control("X","O");
        control.start();
    }
    
}
