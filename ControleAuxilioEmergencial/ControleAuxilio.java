public class ControleAuxilio{
    public boolean TemDireito(Beneficiario beneficiario){
        if(beneficiario.carteiraAssinada == false && beneficiario.idade>=18 && beneficiario.rendaMensal<=3135.00 && beneficiario.carteiraAssinada==false && beneficiario.agentePublico==false && beneficiario.mandatoEletivo==false){
            return true;
        }
        else{
            return false;
        }
    }
    public double ValorDoBeneficio(Beneficiario beneficiario){
        if(beneficiario.sexo=='F'&&beneficiario.chefeDeFamilia==true){
            return 1200.00;
        }
        else{
            return 600.00;
        }
    }
}
