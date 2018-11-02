/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clssync;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ulacit
 */
public class SingleThreadSerpiente extends ThreadBase {

    private Serpiente sync;

    public SingleThreadSerpiente(int id, final Serpiente sync) {
        super(id);
        this.sync = sync;
    }

    @Override
    public void run() {

        try {
            while (!Utils.juegoTerminado && sync.viva) {
                sync.mover();
                System.out.println("Se movio la serpiente: Terminado " + Utils.juegoTerminado +" Serpiente viva:" +sync.viva);
                Thread.sleep(10000);
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(SingleThreadSerpiente.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.setIsRunning(false);
    }

}
