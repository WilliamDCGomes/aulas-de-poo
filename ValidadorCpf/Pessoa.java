public class Pessoa{
    String name;
    String cpf;
    double hight, weight;
    String adress;
    public static boolean validaCPF(String cpf){
        String numeroDoCPF = cpf;
        boolean validade=false;
        if(numeroDoCPF.equals("00000000000")||numeroDoCPF.equals("11111111111")||
        numeroDoCPF.equals("22222222222")||numeroDoCPF.equals("33333333333")||
        numeroDoCPF.equals("44444444444")||numeroDoCPF.equals("55555555555")||
        numeroDoCPF.equals("66666666666")||numeroDoCPF.equals("77777777777")||
        numeroDoCPF.equals("88888888888")||numeroDoCPF.equals("99999999999")||
        numeroDoCPF.length()!=11){
            
        }
        else{
            char [] letras = new char [numeroDoCPF.length()];
            letras = numeroDoCPF.toCharArray();
            int [] numeroCPF = new int [numeroDoCPF.length()];
            for(int x=0;x<numeroDoCPF.length();x++){
                numeroCPF[x]=Integer.parseInt(String.valueOf(letras[x]));
            }
            int primeiraVerif=0,peso=10;
            for(int x=0;x<9;x++){
                primeiraVerif+=numeroCPF[x]*peso;
                peso--;
            }
            primeiraVerif=(primeiraVerif*10)%11;
            if(primeiraVerif==numeroCPF[9]){
                int segundaVerif=0,segundoPeso=11;
                for(int x=0;x<10;x++){
                    segundaVerif+=numeroCPF[x]*segundoPeso;
                    segundoPeso--;
                }
                segundaVerif=(segundaVerif*10)%11;
                if(segundaVerif==numeroCPF[10]){
                    validade=true;
                }
            }
        }
        return validade;
    }
}
