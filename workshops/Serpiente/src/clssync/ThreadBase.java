/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clssync;

/**
 *
 * @author ulacit
 */
public abstract class ThreadBase implements Runnable{
    
    private int id;
    private boolean isRunning = true;
    
    public ThreadBase(final int id)
    {
        this.id=id;
    }

    public boolean isIsRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
