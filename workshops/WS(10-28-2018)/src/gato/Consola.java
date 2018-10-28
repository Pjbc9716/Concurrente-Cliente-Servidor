/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

import static gato.Matriz.matriz;

/**
 *
 * @author Denis Ugalde Meza
 */

public class Consola extends Thread {
    //Llena la Matriz
    public void fillConsole(){
                for (int i=0;i<Matriz.matriz.length;i++){
            for (int j=0;j<Matriz.matriz[i].length;j++){
                String position = i+""+j;
                Matriz.matriz[i][j]=position;
            }
        }
    }
    //Imprime la consola
    public void printConsole(){
        for (int i=0;i<Matriz.matriz.length;i++){
            for (int j=0;j<Matriz.matriz[i].length;j++){
                
                System.out.print("|"+Matriz.matriz[i][j]+"|");
            }
            System.out.println("");
        }
        System.out.println("--------------------");
    }
//    String playerIcon;
//    public void verifica(){
//       //verificación columnas
//       for(int i = 0 ; i < matriz.length ; i++){
//           if(matriz[0][i].equals(playerIcon) && matriz[1][i].equals(playerIcon) && matriz[2][i].equals(playerIcon)){
//               System.out.println("Ganador: " + playerIcon);
//            }
//        }
//       //verificación de filas
//       for(int i = 0 ; i < matriz.length ; i++){
//           if(matriz [i][0].equals(playerIcon) && matriz[i][1].equals(playerIcon) && matriz[i][2].equals(playerIcon)){
//               System.out.println("Ganador: " + playerIcon);
//            }
//        }
//       //verificación de diagonal 1 
//       for(int i = 0 ; i < matriz.length ; i++){
//           if(matriz[0][0].equals(playerIcon) && matriz[1][1].equals(playerIcon) && matriz[2][2].equals(playerIcon)){
//               System.out.println("Ganador: " + playerIcon);
//           }
//        }
//       //verificación diagonal 2
//       for(int i = 0 ; i < matriz.length ; i++){
//           if(matriz[0][2].equals(playerIcon) && matriz[1][1].equals(playerIcon) && matriz[2][0].equals(playerIcon)){
//               System.out.println("Ganador: " + playerIcon);
//            }
//        }
//    }  
    
    @Override
    public void run (){
        printConsole();
        
    }
    
    
}
