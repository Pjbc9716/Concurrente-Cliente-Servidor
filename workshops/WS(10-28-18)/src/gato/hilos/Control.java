/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato.hilos;

import java.util.Scanner;

/**
 *
 * @author PJ129
 */
public class Control extends Thread {
    static String player1, player2;

    public Control(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
 
    //Lleva el turno de los jugadores
    public void manageGame (){
        try{
           Jugadores jugadores = new Jugadores();
           int player =1;
           while(true){
               switch (player){
                   case 1:
                       jugadores.getPosition(this.player1);
                       player =2;
                       break;
                   case 2:
                       jugadores.getPosition(this.player2);
                       player =1;
                       break;
               }
           }

            
    }catch (StackOverflowError e){
            System.out.println("Falta el metodo de verificacion!!");
    }
    }
    
    @Override
    public void run(){
        manageGame();
    }
    
    
}
