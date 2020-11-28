public class Televisao extends Produto{
    private double peso;
    private double tamanho;
    private String resolucao;

    public void insereTelevisao(double peso, double tamanho, String resolucao){
        this.peso = peso;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
    }    
}