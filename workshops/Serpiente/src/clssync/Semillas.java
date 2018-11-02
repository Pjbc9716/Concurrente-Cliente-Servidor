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
public class Semillas {

    public synchronized void generarSemilla() {

        int contadorSemillas = 0;
        String temp = "";
        while (contadorSemillas < 3) {
            try {
                Random random = new Random();

                int fila = random.nextInt(Utils.matriz.length - 1);
                int columna = random.nextInt(Utils.matriz.length - 1);
                if (Utils.matriz[fila][columna] == 0) {
                    Utils.matriz[fila][columna] = 1;
                    temp += "Se puso una semilla en la posición " + fila + " " + columna + "\n";
                    contadorSemillas++;
                    Utils.cantidadSemillasGeneradas++;
                    System.out.println(Utils.imprimirMatriz());
                }
                Thread.sleep(10);

            } catch (InterruptedException ex) {
                Logger.getLogger(SaveLogInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Utils.logs = temp;//es el que imprime
        
        System.out.println("Se generaron " + Utils.cantidadSemillasGeneradas + " semillas");
            System.out.println("Las serpientes se comieron " + Utils.cantidadSemillasSerpientes + " semillas");
            System.out.println("El usuario se comio " + Utils.cantidadSemillasUsuario + " semillas");

    }
}
