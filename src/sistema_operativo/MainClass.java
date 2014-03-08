package sistema_operativo;

/**
 *
 * @author cosentino.tommaso
 */
public class MainClass {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Thread coda[][] = new Thread [5][10];
        String nome = "processo";
        int priorita, tempo;
        boolean start;
        int numProcessi = 10;
        for(int i=0; i<numProcessi; i++){
            priorita = (int)(Math.random() * 4);
            tempo = (int)(Math.random() * 100 + 1);
            MyThread processo = new MyThread(nome + i, priorita, tempo);
            Thread newProcesso = new Thread(processo);
            int j=0;
            while(coda[priorita][j] != null){
                j++;
            }
            coda[priorita][j] = newProcesso;
        }
        for(int r=0; r<5; r++){
            for(int c=0; c<10; c++){
                if(coda[r][c] != null)
                    coda[r][c].start();
            }
        }
    }
}
