public class ContaBeneficiario{
    public int numeroConta;
    private double valor = 0;
    
    public ContaBeneficiario(int numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public void Depositar(double valor){
        this.valor += valor;
    }
    public double ConcultarSaldo(){
        return valor;
    }
}
