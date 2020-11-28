public class Produto{
    String fabricante;
    String nomeProduto;
    double preco;
    int quantidade;
    int quantidadeMinima;
    public Produto(String fabricante, String nomeProduto, double preco, int quantidade, int quantidadeMinima){
        this.fabricante = fabricante;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.quantidadeMinima = quantidadeMinima;
    }
    public boolean produtoAbaixoDoMinimo(){
        if(quantidadeMinima>quantidade){
            return true;
        }
        return false;
    }
    public int pegarQuantidade(){
        return quantidade;
    }
    public double pegarPreco(){
        return preco;
    }
}
