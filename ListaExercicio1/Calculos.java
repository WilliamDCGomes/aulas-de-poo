public class Calculos{
    public double salarioBruto;
    public double salarioBruto(FolhaDePagamento folha){
        salarioBruto = folha.horasTrabalhadas * folha.salarioHora + (50 * folha.numeroDependentes);
        return salarioBruto;
    }
    public double descontoINSS(){
        if(salarioBruto <= 1000){
            return salarioBruto * 8.5/100;
        }
        else{
            return salarioBruto * 9/100;
        }
    }
    public double descontoIR(){
        if(salarioBruto <= 500){
            return 0;
        }
        else if(salarioBruto>500 && salarioBruto <= 1000){
            return salarioBruto * 5/100;
        }
        else{
            return salarioBruto *7/100;
        }
    }
    public double salarioLiquido(){
        return salarioBruto - descontoINSS() - descontoIR();
    }
}