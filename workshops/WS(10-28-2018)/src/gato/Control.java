package gato;

import static gato.Matriz.matriz;

/**
 *
 * @author Denis Ugalde Meza
 */
public class Control extends Thread {
    
    static String player1, player2, playerIcon;

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
            System.out.println("Falta el método verifica");
        
        }
    }
    @Override
    public void run(){
        manageGame();
    }
}
