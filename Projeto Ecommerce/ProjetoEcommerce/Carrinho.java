import java.util.ArrayList;
import java.util.List;
public class Carrinho{
    List<Produto> produtos = new ArrayList<Produto>();
    ArrayList quantidades = new ArrayList();
    double price = 0;
    public void adicionaNoCarrinho(Produto produto, int quantidade){
        produtos.add(produto);
        quantidades.add(quantidade);
        price += (produto.pegarPreco() * quantidade);
    }
    public void removerDoCarrinho(Produto produto){
        int index = -1;
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).nomeProduto.equals(produto.nomeProduto)){
                index = i;
                break;
            }
        }
        if(index!=-1){
            price -= (produtos.get(index).pegarPreco() * produtos.get(index).quantidade);
            produtos.remove(index);
            quantidades.remove(index);
        }
        else{
            System.out.println("Produto não cadastrado");
        }
    }
}
