/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clssync;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 *
 * @author ulacit
 */
public class Monitor implements Callable<String> {

    private List<ThreadBase> threadList;
    
    public Monitor(List<ThreadBase> threadList)
    {
        this.threadList = threadList;
    }
    
    @Override
    public String call() throws Exception {
        
        boolean isRunning = true;
        while(isRunning)
        {
            isRunning = false;
            for(ThreadBase i : threadList)
            {
                if(i.isIsRunning())
                {
                    isRunning = true;
                    break;
                }
            }
            
            Thread.sleep(100);
        }
        
        return Utils.logs;
    }
    
}
