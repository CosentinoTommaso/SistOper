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
        String nome = "processo";
        int priorita, tempo;
        boolean start;
        int numProcessi = 10;
        for(int i=0; i<numProcessi; i++){
            priorita = (int)(Math.random() * 4);
            tempo = (int)(Math.random() * 100 + 1);
            MyThread processo = new MyThread(nome + i, priorita, tempo);
            Thread newProcesso = new Thread(processo);
            Coda coda = new Coda(newProcesso, priorita, tempo);
            coda.setArray(newProcesso);
            newProcesso = coda.getStart();
            newProcesso.start();
        }
    }
}
