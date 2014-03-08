package sistema_operativo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cosentino.tommaso
 */
public class MyThread implements Runnable{
    String nome;
    int priorita, tempo, TS = 20;
    MyThread(String nome, int priorita, int tempo){
        this.nome = nome;
        this.priorita = priorita;
        this.tempo = tempo;
        //System.out.println(nome + " " + priorita);
    }

    @Override
    public void run(){
        tempo = tempo - TS;
        if(tempo<0){
            tempo = 0;
            System.out.println(nome + " priorita: " + priorita + " tempo: " + tempo);
        }else{
            System.out.println(nome + " priorita: " + priorita + " tempo: " + tempo);
        }

        /*try {
            this.wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
    }
}
