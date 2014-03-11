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
        MyThread coda[][] = new MyThread [5][10];
        String nome = "processo";
        int priorita, tempo;
        boolean start;
        int numProcessi = 10;
        for(int i=0; i<numProcessi; i++){
            priorita = (int)(Math.random() * 5);
            tempo = (int)(Math.random() * 100 + 1);
            MyThread processo = new MyThread(nome + i, priorita, tempo, coda);
            Thread newProcesso = new Thread(processo);
            int j=0;
            while(coda[priorita][j] != null){
                j++;
            }
            coda[priorita][j] = processo;
            newProcesso.start();
            
        }
    }
}
