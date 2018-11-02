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
public class SaveLogInfo extends ThreadBase {

    public SaveLogInfo(final int id) {
        super(id);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                String temp = Utils.logs;
                Thread.sleep(100);
                temp = temp + "id -> " + super.getId() + " r-> " + i + "\n";
                Utils.logs = temp;
            } catch (InterruptedException ex) {
                Logger.getLogger(SaveLogInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        super.setIsRunning(false);
    }

}
