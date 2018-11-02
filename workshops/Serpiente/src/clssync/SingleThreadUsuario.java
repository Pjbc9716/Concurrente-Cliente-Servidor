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
public class SingleThreadUsuario extends ThreadBase {

    private Usuario sync;

    public SingleThreadUsuario(int id, final Usuario sync) {
        super(id);
        this.sync = sync;
    }

    @Override
    public void run() {
        try {
            while (!Utils.juegoTerminado) {
                sync.buscarSemilla();
                Thread.sleep(5000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(SingleThreadUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.setIsRunning(false);
    }

}
