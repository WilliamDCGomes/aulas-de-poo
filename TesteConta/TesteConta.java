public class TesteConta{
        public static void main(String[] args){
        Cliente cliente1 = new Cliente("Jose da Silva", "Bauru", "jose@hotmail.com", "(14) 99839-8097", "125.896.669-55", 155236);
        Conta c = new Conta(4000.0, cliente1);
        c.deposito(1000.0);
        c.mostraSaldo();
        System.out.println(c.cliente.nome);
        Banco banco = new Banco();
        System.out.println(banco.totalSaldoContas());
    }
}