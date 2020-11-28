public class Cerveja extends Produto {
    private double teorAlcoolico;
    private String prazoValidade;

    public void insereCerveja(double teorAlcoolico, String prazoValidade){
        this.teorAlcoolico = teorAlcoolico;
        this.prazoValidade = prazoValidade;
    }

}