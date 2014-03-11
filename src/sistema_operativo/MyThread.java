package sistema_operativo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cosentino.tommaso
 */
public class MyThread implements Runnable{
    MyThread coda[][] = new MyThread[5][10];
    String nome;
    int priorita, tempo, TS = 20, stato;
    //stato = 0 appena creato, 1 esec , 2 sosp, 3 termin.
    MyThread(String nome, int priorita, int tempo, MyThread coda[][]){
        this.nome = nome;
        this.priorita = priorita;
        this.tempo = tempo;
        this.coda = coda;
        this.stato = 2;
        //System.out.println(nome + " " + priorita);
    }
    
    public void scheduler(MyThread processo) throws InterruptedException{
        for(int r=0;r<5;r++){
            for(int c=0;c<10;c++){
                if(coda[r][c] != null)
                    processo = coda[r][c];
                    processo.stato = 1;
                    processo.run();
            }
        }
    }
    
    @Override
    public void run(){
        try {
            if(this.stato == 2)
                this.scheduler(this);
            this.tempo = this.tempo - TS;
            if(this.tempo<0)
                this.tempo=0;
            if(this.tempo == 0){
                System.out.println(nome + " priorita: " + priorita + " tempo: " + tempo);
                this.stato = 3;
            }else{
                System.out.println(nome + " priorita: " + priorita + " tempo: " + tempo);
                this.stato = 2;
            }
            this.scheduler(this);
        }catch (InterruptedException ex) {
            System.out.println("processo terminato");
        }
    }
}
