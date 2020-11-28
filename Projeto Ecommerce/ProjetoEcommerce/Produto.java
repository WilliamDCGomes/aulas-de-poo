public class Produto  {
    String fabricante;
    String nome;
    double preco;
    public void insereProduto(String nomeDoFabricante, String nome, double preco){
        this.fabricante = nomeDoFabricante;
        this.nome = nome;
        this.preco = preco;
    }

    public String pegaNome(){
        return nome;
    }
    public double pegaPreco(){
        return preco;
    }

    
}