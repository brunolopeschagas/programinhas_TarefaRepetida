/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefarepetida;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Br
 */
public class TarefaRepetida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Timer timer = new Timer();
        
        final long SEGUNDOS = (1000 * 5);
        
        TimerTask tarefa = new TimerTask() {
           
            @Override
            public void run() {
                
                //repetido de tempos em tempos
                System.out.println(new Date());
                
            }
            
        };
        
        timer.scheduleAtFixedRate(tarefa, 0, SEGUNDOS);
        
    }
    
}
