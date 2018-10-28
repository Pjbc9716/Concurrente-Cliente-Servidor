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
    
    @Override
    public void run (){
        printConsole();
        
    }
    
    
}
