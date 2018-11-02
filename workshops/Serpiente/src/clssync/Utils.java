/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clssync;

/**
 *
 * @author ulacit
 */
public class Utils {
    
    public static String logs="";
    
    public static int[][]matriz= new int [10][10];//crea la matriz
    public static int cantidadSemillasSerpientes=0;
    public static int cantidadSemillasUsuario=0;
    public static int cantidadSemillasGeneradas=0;
    public static boolean juegoTerminado=false;

    public static String imprimirMatriz() {
        String salida="";
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                salida+= matriz[i][j]+" ";
            }
            salida+="\n";
        }
        return salida;
    }
    
}
