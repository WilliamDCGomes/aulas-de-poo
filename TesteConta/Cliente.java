public class Cliente{
    int numeroConta;
    String cpf;
    String nome;
    String endereco;
    String email;
    String telefone;
    public Cliente(String nome, String endereco, String email, String telefone, String cpf, int numeroConta){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
    }
}
