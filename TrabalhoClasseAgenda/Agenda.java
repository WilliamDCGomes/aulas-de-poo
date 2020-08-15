public class Agenda{
    public Pessoa[] p = new Pessoa[10];
    
    public void armazenaPessoa(Pessoa pessoa, int posicao){
        if(p[posicao]==null){
            p[posicao]=pessoa;
            System.out.println("Pessoa adicionada com sucesso!\n");
        }
        else{
            System.out.println("Erro em adiciona uma nova pessoa\n");
        }
    }
    
    public void removePessoa(String nome){
        for(int i=0;i<10;i++){
            if(p[i].getNome().equals(nome)){
                p[i]=null;
                System.out.println(nome + " removido(a) com sucesso!\n");
                break;
            }
        }
    }
    
    public int buscaPessoa(String nome){
        for(int i=0;i<10;i++){
            if(p[i].getNome().equals(nome)){
                return i;
            }
        }
        return -1;
    }
    
    public void imprimeAgenda(){
        System.out.println("AGENDA");
        for(int i=0;i<10;i++){
            if(p[i]!=null){
                System.out.println("Index: " + (i+1));
                System.out.println("Nome: " + p[i].getNome());
                System.out.println("email: " + p[i].getEmail());
                System.out.println("Telefone: " + p[i].getTelefone() + "\n");
            }
        }
    }
    
    public void imprimePessoa(int index){
        if(p[index]!=null){
            System.out.println("PESSOA");
            System.out.println("Nome: " + p[index].getNome());
            System.out.println("email: " + p[index].getEmail());
            System.out.println("Telefone: " + p[index].getTelefone() + "\n");
        }
    }
}