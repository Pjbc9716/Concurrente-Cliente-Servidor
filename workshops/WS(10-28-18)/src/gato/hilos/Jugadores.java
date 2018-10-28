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
public class Jugadores extends Thread {
   int row, column;
   String playerIcon;
   //Metodo que genera la posicion del jugador
   public void getPosition (String player){
       this.playerIcon = player;
       int limit = Matriz.matriz.length;
       this.row = (int)(Math.random()*limit);
       this.column = (int)(Math.random()*limit);
       addPlayer(player,row,column);
       
   }
   //Verifica si la posicion esta disponible
   public boolean verifyPosition(int row, int column){
       boolean space =Matriz.matriz[row][column].equals(Control.player1)||Matriz.matriz[row][column].equals(Control.player2);
       return space;
   }
   //Agrega el jugador a la posicion si es posible
   public void addPlayer (String player,int row, int column){
       Consola consola = new Consola();
       if (!verifyPosition(row,column)){
           Matriz.matriz[row][column]=player;
           consola.printConsole();
   }else{
         getPosition(this.playerIcon);

   }
   }
   
    
}
