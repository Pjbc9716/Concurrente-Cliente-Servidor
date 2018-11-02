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
public class ComplexThread extends ThreadBase {

    private ComplexSync sync;
    public ComplexThread(int id, final ComplexSync sync) {
        super(id);
        this.sync=sync;
    }

    @Override
    public void run() {
       for(int i=0;i<100;i++)
       {
           String temp = sync.getTemp();
           try {
               Thread.sleep(10);
           } catch (InterruptedException ex) {
               Logger.getLogger(ComplexThread.class.getName()).log(Level.SEVERE, null, ex);
           }
           temp = temp + "id-> " + super.getId() + " i " + i + "\n";
           sync.saveTemp(temp);
       }
       super.setIsRunning(false);
    }
    
}
