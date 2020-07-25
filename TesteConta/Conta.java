public class Conta{
    double saldo;
    Cliente cliente;
    public Conta(double saldoInicial, Cliente cliente){
        this.saldo = saldoInicial;
        this.cliente = cliente;
    }
    public void deposito(double d){
        this.saldo = this.saldo + d;
    }
    public void saque(double s){
            this.saldo = this.saldo - s;
    }
    public double pegaSaldo(){
        return this.saldo;
    }
    public void mostraSaldo(){
        System.out.println("R$ " +  this.saldo);
    }
    public void transferencia(Conta c, double v){

    }
}