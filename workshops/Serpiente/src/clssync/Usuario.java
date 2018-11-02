/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clssync;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ulacit
 */
public class Usuario {
    
    private int x;
    private int y;

    public Usuario() {
        this.x = 0;
        this.y = 0;
    }

    public synchronized void buscarSemilla() {

        String temp = "";
       
            try {
                Random random = new Random();

                int fila = random.nextInt(Utils.matriz.length - 1);
                int columna = random.nextInt(Utils.matriz.length - 1);
                int posicion = Utils.matriz[fila][columna];
                
                switch(posicion){
                    
                    case 0: cambiarUbicacion(fila,columna);
                            break;
                    
                    case 1: cambiarUbicacion(fila,columna);
                            Utils.cantidadSemillasUsuario++;
                            break;
                            
                    case 2: Utils.juegoTerminado = true;  
                          
                
                }
                
                if (Utils.matriz[fila][columna] == 1) {
                    Utils.matriz[fila][columna] = 3;
                    temp += "El usuario obtuvo una semilla " + fila + " " + columna + "\n";
                }
                Thread.sleep(5000);

            } catch (InterruptedException ex) {
                Logger.getLogger(SaveLogInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        Utils.logs = temp;//es el que imprime

    }
    
    private void cambiarUbicacion(int x, int y){
       Utils.matriz[this.x][this.y] = 0;
       this.x = x;
       this.y = y;
       Utils.matriz[x][y] = 3;
    }
}
