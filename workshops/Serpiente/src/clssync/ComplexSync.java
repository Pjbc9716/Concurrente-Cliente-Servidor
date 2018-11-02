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
public class ComplexSync {
    
    private boolean block = false;
    
    
    public synchronized String getTemp()
    {
        while(block)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ComplexSync.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        block = true;
        
        return Utils.logs;
    }
    
    public synchronized void saveTemp(final String temp)
    {
        while(!block)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ComplexSync.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        Utils.logs = temp;
        block = false;
        notify();
    }
    
}
