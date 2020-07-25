public class Banco{
    Conta[] contas = new Conta[10];
    public double totalSaldoContas(){
        double saldoTotal = 0.0;
        for(int i=0; i<10; i++){
            saldoTotal += contas[i].pegaSaldo();
        }
        return saldoTotal;
    }
    
    public int totalContasCadastradas(){
        return 0;
    }
}
