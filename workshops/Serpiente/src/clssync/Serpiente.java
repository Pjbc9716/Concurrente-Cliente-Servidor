/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clssync;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ulacit
 */
public class Serpiente {

    private int x;
    private int y;
    private boolean paraAtras = false;
    public boolean viva = true;

    public Serpiente() {
        posicionInicial();
    }

    public void posicionInicial() {

        boolean encontrado = false;
        String temp = "";

        while (encontrado == false) {
            Random random = new Random();

            int fila = random.nextInt(Utils.matriz.length - 1);
            int columna = random.nextInt(Utils.matriz.length - 1);
            if (Utils.matriz[fila][columna] == 0) {
                Utils.matriz[fila][columna] = 2;
                this.x = fila;
                this.y = columna;
                temp += "Se puso una serpiente en la posición " + fila + " " + columna + "\n";
                encontrado = true;
                System.out.println(Utils.imprimirMatriz());
            }

        }

        Utils.logs += temp;//es el que imprime

    }

    public synchronized void mover() {

        if (x == Utils.matriz[0].length - 1 && y == Utils.matriz[0].length - 1) {
            viva = false;
            Serpiente serpiente= new Serpiente();
                ThreadBase thread = new SingleThreadSerpiente(9, serpiente);
                List<ThreadBase> threadList = new ArrayList<>();
                threadList.add(thread);
            return;
        }

        System.out.println("x:" + x + " y " + y);
        try {

            if (!paraAtras) {

                // Moverse a la derecha normal
                if (y + 1 < Utils.matriz[0].length) {
                    if (Utils.matriz[x][y + 1] == 0) {//Si es =0 se mueve y el espacio esta vacio
                        Utils.matriz[x][y] = 0;
                        this.y = y + 1;
                        Utils.matriz[x][y] = 2;
                        paraAtras = false;
                    }
                    if (Utils.matriz[x][y + 1] == 1) {//Si es =0 se mueve y es una semilla 
                        Utils.matriz[x][y + 1] = 0;// Se comio la semilla. 
                        Utils.cantidadSemillasSerpientes++;
                    }
                    if (Utils.matriz[x][y + 1] == 3) {//Si es =0 se mueve y es un usuario
                        Utils.juegoTerminado = true;
                        this.viva=false;
                    }
                }

                int tamannio = Utils.matriz[0].length;
                // Moverse abajo porque llegue al final de la fila
                if (y + 1 == tamannio) {
                    int celdaAbajo = Utils.matriz[x + 1][y];
                    switch (celdaAbajo) {

                        case 0:
                            Utils.matriz[x + 1][y] = 2;
                            Utils.matriz[x][y] = 0;
                            this.x = x + 1;
                            paraAtras = true;
                            break;
                        case 1:
                            Utils.matriz[x + 1][y] = 0;// Se comio la semilla. 
                             {
                                try {
                                    Thread.sleep(10000);
                                } catch (InterruptedException ex) {
                                    //
                                }
                            }
                            Utils.cantidadSemillasSerpientes++;
                            break;
                        case 3:
                            Utils.juegoTerminado = true;
                            this.viva = false;
                            break;
                    }

                }

            } else {
                // SI VOY PARA ATRAS
                if (y > 0) {
                    int celdaIz = Utils.matriz[x][y - 1];
                    switch (celdaIz) {
                        case 0:
                            Utils.matriz[x][y - 1] = 2;
                            Utils.matriz[x][y] = 0;
                            this.y = y - 1;
                            break;
                        case 1:
                            Utils.matriz[x][y - 1] = 0;// Se comio la semilla.
                             {
                                try {
                                    Thread.sleep(10000);
                                } catch (InterruptedException ex) {
                                    //
                                }
                            }
                            Utils.cantidadSemillasSerpientes++;
                            break;
                        case 3:
                            Utils.juegoTerminado = true;
                            this.viva=false;
                            break;

                    }
                }
                if (y == 0) {
                    int celdaAbajo = Utils.matriz[x + 1][y];
                    switch (celdaAbajo) {

                        case 0:
                            Utils.matriz[x + 1][y] = 2;
                            Utils.matriz[x][y] = 0;
                            this.x = x + 1;
                            paraAtras = false;
                            break;
                        case 1:
                            Utils.matriz[x + 1][y] = 0;// Se comio la semilla. 
                             {
                                try {
                                    Thread.sleep(10000);
                                } catch (InterruptedException ex) {
                                    //
                                }
                            }
                            Utils.cantidadSemillasSerpientes++;
                            break;
                        case 3:
                            Utils.juegoTerminado = true;
                            break;
                    }

                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Utils.logs += "Se movio la serpiente " + x + " " + y + "\n";

        System.out.println(Utils.imprimirMatriz());

    }
}
