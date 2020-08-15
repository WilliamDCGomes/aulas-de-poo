public class Principal{
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.armazenaPessoa(new Pessoa("William Douglas", "xxxx@hotmail.com", "(xx) xxxxx-xxxx") ,0);
        agenda.armazenaPessoa(new Pessoa("José Ribeiro", "sasasax@hotmail.com", "(xx) xxxx-xxxx") ,1);
        agenda.imprimePessoa(1);
    }
}
