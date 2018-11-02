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
public class SingleThreadSemilla extends ThreadBase {

    private Semillas sync;

    public SingleThreadSemilla(int id, final Semillas sync) {
        super(id);
        this.sync = sync;
    }

    @Override
    public void run() {

        try {
            while (!Utils.juegoTerminado) {
                sync.generarSemilla();
                Thread.sleep(10000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(SingleThreadSemilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        super.setIsRunning(false);

    }

}
