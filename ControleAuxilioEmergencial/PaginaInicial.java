public class PaginaInicial{
    public static void main(String[] args) {
        Beneficiario beneficiario1 = new Beneficiario("Matheus Trombini", 21, 'M', false, 0.00, false, false, false, new ContaBeneficiario(1001));
        Beneficiario beneficiario2 = new Beneficiario("William Douglas", 22, 'M', false, 1480.00, true, false, false, new ContaBeneficiario(1002));
        
        ControleAuxilio controleAuxilio = new ControleAuxilio();
        
        if(controleAuxilio.TemDireito(beneficiario1)==true){
            beneficiario1.conta.Depositar(controleAuxilio.ValorDoBeneficio(beneficiario1));
            System.out.println(beneficiario1.name + " recebeu: R$ " + beneficiario1.conta.ConcultarSaldo());
        }
        else{
            System.out.println(beneficiario1.name + " não tem direito ao Auxilio Emergencial");
        }
        if(controleAuxilio.TemDireito(beneficiario2)==true){
            beneficiario2.conta.Depositar(controleAuxilio.ValorDoBeneficio(beneficiario2));
            System.out.println(beneficiario2.name + " recebeu: R$ " + beneficiario2.conta.ConcultarSaldo());
        }
        else{
            System.out.println(beneficiario2.name + " não tem direito ao Auxilio Emergencial");
        }
    }
}
