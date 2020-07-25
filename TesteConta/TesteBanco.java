public class TesteBanco{
    public static void main(String[] args){
        Banco banco1 = new Banco();
        Cliente cliente1 = new Cliente();
        cliente1.nome = "João";
        Cliente cliente2 = new Cliente();
        cliente2.nome = "Maria";
        Conta c = new Conta(4000.0, cliente1);
        Conta c2 = new Conta(4000.0, cliente2);
        banco1.contas[0] = c;
        banco1.contas[1] = c2;
        int totconta = 0;
        totconta = banco1.totalContasCadastradas();
        System.out.println(totconta);
        double totsaldo = 0.0;
        totsaldo = banco1.totalSaldoContas();
        System.out.println(totsaldo);
    }
}
