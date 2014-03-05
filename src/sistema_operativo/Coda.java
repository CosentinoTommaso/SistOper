package sistema_operativo;

/**
 *
 * @author cosentino.tommaso
 */
public class Coda {
    Thread coda [][] = new Thread [5][10];
    Thread newProcesso, processo;
    int Ts = 25;
    int priorita, tempo, i;
    boolean start = false;
    Coda(Thread newProcesso, int priorita, int tempo){
        this.newProcesso = newProcesso;
        this.priorita = priorita;
        this.tempo = tempo;
        
    }
    void setArray(Thread newProcesso){
        i=0;
        while(coda[priorita][i]!=null){
            i++;
        }
        coda[priorita][i] = newProcesso;
    }
    Thread getStart(){
        i=0;
        while(coda[priorita][i] != null){
            i++;
            break;
        }
        for(priorita = 0 ; priorita < 5 ; priorita++ ){
            switch(priorita){
                case 0:
                    i=0;
                    while(coda[priorita][i]==null){
                        i++;
                        if(coda[priorita][9] == null)
                            break;
                    }
                    processo = coda[priorita][i];
                    break;
                case 1:
                    i=0;
                    while(coda[priorita][i]==null){
                        i++;
                        if(coda[priorita][9] == null)
                            break;
                    }
                    processo = coda[priorita][i];
                    break;
                case 2:
                    i=0;
                    while(coda[priorita][i]==null){
                        i++;
                        if(coda[priorita][9] == null)
                            break;
                    }
                    processo = coda[priorita][i];
                    break;
                case 3:
                    i=0;
                    while(coda[priorita][i]==null){
                        i++;
                        if(coda[priorita][9] == null)
                            break;
                    }
                    processo = coda[priorita][i];
                    break;
                case 4:
                    i=0;
                    while(coda[priorita][i]==null){
                        i++;
                        if(coda[priorita][9] == null)
                            break;
                    }
                    processo = coda[priorita][i];
                    break;
            }
        }
        return processo;
    }
}
