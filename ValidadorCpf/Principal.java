public class Principal
{
    public static void main(String[] args){
        Pessoa execuPessoa = new Pessoa();
        execuPessoa.cpf="44658858819".replace(".","").replace("-","");
        boolean validaCPFExecu;
        validaCPFExecu = execuPessoa.validaCPF(execuPessoa.cpf);
        System.out.println(validaCPFExecu);
    }
}
