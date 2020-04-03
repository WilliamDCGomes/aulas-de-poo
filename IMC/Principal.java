public class Principal
{
    public static void main(String[] args){
        Pessoa varPessoa = new Pessoa();
        Double imc=varPessoa.verificaIMC(1.78,68.9);
        if(imc<18.5){
            System.out.println("Classificação: Déficit de massa corporal");
            System.out.println("Riscos Relacionados: Baixo(com risco de outras doenças)");
        }
        else if(imc>=18.5&&imc<=24.9){
            System.out.println("Classificação: Massa corporal normal");
            System.out.println("Riscos Relacionados: Normal");
        }
        else if(imc>=25.0&&imc<=29.9){
            System.out.println("Classificação: Sobrepeso");
            System.out.println("Riscos Relacionados: Elevado");
        }
        else if(imc>=30.0&&imc<=34.9){
            System.out.println("Classificação: Obesidade leve");
            System.out.println("Riscos Relacionados: Alto");
        }
        else if(imc>=35.0&&imc<=39.9){
            System.out.println("Classificação: Obesidade média");
            System.out.println("Riscos Relacionados: Muito Alto");
        }
        else{
            System.out.println("Classificação: Obesidade mórbida");
            System.out.println("Riscos Relacionados: Iminente");
        }
    }
}
