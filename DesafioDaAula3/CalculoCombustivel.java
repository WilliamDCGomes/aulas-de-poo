public class CalculoCombustivel
{
    public static void main(String[] args){
        float valorGasolina = 4.15f;
        float valorAlcool=3.15f;
        float rendimentoGasolina=valorGasolina*0.7f;
        if(rendimentoGasolina<valorAlcool){
            System.out.println("A gasolina é melhor!");
        }else{
            System.out.println("O Alcool é melhor!");
        }
    }
}
