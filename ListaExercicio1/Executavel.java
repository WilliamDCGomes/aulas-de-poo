public class Executavel{
    public static void main(String[] args) {
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento(10, 100, 1);
        Calculos calculos = new Calculos();
        System.out.printf("Salário Bruto: %.2f\n", calculos.salarioBruto(folhaDePagamento));
        System.out.printf("Desconto INSS: %.2f\n", calculos.descontoINSS());
        System.out.printf("Desconto IR: %.2f\n", calculos.descontoIR());
        System.out.printf("Salário Líquido: %.2f\n", calculos.salarioLiquido());
    }
}