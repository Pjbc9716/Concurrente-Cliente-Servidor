package gato;
import static gato.Matriz.matriz;
import javax.swing.JOptionPane;
/**
 *
 * @author Denis Ugalde Meza
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
           Matriz.matriz[row][column]= player;
           consola.printConsole();
   }else{
         getPosition(this.playerIcon);

        }
    }
   
   public void verifica(){
       //verificación columnas
       for(int i = 0 ; i < matriz.length ; i++){
           if(matriz[0][i].equals(playerIcon) && matriz[1][i].equals(playerIcon) && matriz[2][i].equals(playerIcon)){
               System.out.println("Ganador: " + playerIcon);
            }
        }
       //verificación de filas
       for(int i = 0 ; i < matriz.length ; i++){
           if(matriz [i][0].equals(playerIcon) && matriz[i][1].equals(playerIcon) && matriz[i][2].equals(playerIcon)){
               System.out.println("Ganador: " + playerIcon);
            }
        }
       //verificación de diagonal 1 
       for(int i = 0 ; i < matriz.length ; i++){
           if(matriz[0][0].equals(playerIcon) && matriz[1][1].equals(playerIcon) && matriz[2][2].equals(playerIcon)){
               System.out.println("Ganador: " + playerIcon);
           }
        }
       //verificación diagonal 2
       for(int i = 0 ; i < matriz.length ; i++){
           if(matriz[0][2].equals(playerIcon) && matriz[1][1].equals(playerIcon) && matriz[2][0].equals(playerIcon)){
               System.out.println("Ganador: " + playerIcon);
            }
        }
    }    
}
