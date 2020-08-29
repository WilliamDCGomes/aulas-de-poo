public class Beneficiario{
    public String name;
    public int idade;
    public char sexo;
    public boolean chefeDeFamilia;
    public double rendaMensal;
    public boolean carteiraAssinada;
    public boolean agentePublico;
    public boolean mandatoEletivo;
    public ContaBeneficiario conta;
    
    public Beneficiario(String name, int idade, char sexo, boolean chefeDeFamilia, double rendaMensal, boolean carteiraAssinada, boolean agentePublico, boolean mandatoEletivo, ContaBeneficiario conta){
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
        this.chefeDeFamilia = chefeDeFamilia;
        this.rendaMensal = rendaMensal;
        this.carteiraAssinada = carteiraAssinada;
        this.agentePublico = agentePublico;
        this.mandatoEletivo = mandatoEletivo;
        this.conta = conta;
    }
    
}
