public class Computador extends Produto{
    private int hd;
    private int memoria;
    private String processador;
    
    public void insereProduto(int hd, int memoria, String processador){
        this.hd = hd;
        this.memoria = memoria;
        this.processador = processador;
    }
}