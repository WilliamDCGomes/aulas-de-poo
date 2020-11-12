public class Main{
    public static void main(String [] args){
        BallotBox ballotBox = new BallotBox();
        NullOrBlankVonte nullOrBlankVonte = new NullOrBlankVonte(ballotBox);
        Candidate candidate1 = new Candidate("Lula", 75, ballotBox);
        candidate1.positionOfCandidate("Presidente");
        Candidate candidate2 = new Candidate("Bolsonaro", 65, ballotBox);
        candidate2.positionOfCandidate("Presidente");
        Candidate candidate3 = new Candidate("Michel Temer", 80, ballotBox);
        candidate2.positionOfCandidate("Presidente");
        
        Candidate candidate4 = new Candidate("José Sarney", 90, ballotBox);
        candidate4.positionOfCandidate("Senador");
        Candidate candidate5 = new Candidate("Alvaro Dias", 75, ballotBox);
        candidate5.positionOfCandidate("Senador");
        Candidate candidate6 = new Candidate("Eduardo Braga", 59, ballotBox);
        candidate6.positionOfCandidate("Senador");
        
        Candidate candidate7 = new Candidate("Eduardo Bolsonaro", 36, ballotBox);
        candidate7.positionOfCandidate("Deputado");
        Candidate candidate8 = new Candidate("Celso Russomanno", 64, ballotBox);
        candidate8.positionOfCandidate("Deputado");
        Candidate candidate9 = new Candidate("Tiririca", 55, ballotBox);
        candidate9.positionOfCandidate("Deputado");
        
        
        Elector elector1 = new Elector("Bruno", 15);
        if(!elector1.canVote()){
            System.out.println(elector1.name + " não pode votar esse ano!");
        }
        else{
            nullOrBlankVonte.insertNullBlankVonte();
            nullOrBlankVonte.insertNullBlankVonte();
            nullOrBlankVonte.insertNullBlankVonte();
        }
        Elector elector2 = new Elector("Karina", 35);
        if(!elector2.canVote()){
            System.out.println(elector2.name + " não pode votar esse ano!");
        }
        else{
            candidate2.receiveVote();
            candidate2.addElector(elector2);
            candidate5.receiveVote();
            candidate5.addElector(elector2);
            candidate9.receiveVote();
            candidate9.addElector(elector2);
        }
        Elector elector3 = new Elector("João", 65);
        if(!elector3.canVote()){
            System.out.println(elector3.name + " não pode votar esse ano!");
        }
        else{
            candidate2.receiveVote();
            candidate2.addElector(elector3);
            nullOrBlankVonte.insertNullBlankVonte();
            candidate7.receiveVote();
            candidate7.addElector(elector3);
        }
        Elector elector4 = new Elector("Francisco", 31);
        if(!elector4.canVote()){
            System.out.println(elector4.name + " não pode votar esse ano!");
        }
        else{
            candidate1.receiveVote();
            candidate1.addElector(elector4);
            candidate6.receiveVote();
            candidate6.addElector(elector4);
            candidate8.receiveVote();
            candidate8.addElector(elector4);
        }
        Elector elector5 = new Elector("Júlia", 41);
        if(!elector5.canVote()){
            System.out.println(elector5.name + " não pode votar esse ano!");
        }
        else{
            candidate2.receiveVote();
            candidate2.addElector(elector5);
            candidate5.receiveVote();
            candidate5.addElector(elector5);
            nullOrBlankVonte.insertNullBlankVonte();
        }
        Elector elector6 = new Elector("Paula", 14);
        if(!elector6.canVote()){
            System.out.println(elector6.name + " não pode votar esse ano!");
        }
        else{
            candidate2.receiveVote();
            candidate2.addElector(elector6);
            candidate6.receiveVote();
            candidate6.addElector(elector6);
            candidate7.receiveVote();
            candidate7.addElector(elector6);
        }
        Elector elector7 = new Elector("Jennifer", 21);
        if(!elector7.canVote()){
            System.out.println(elector7.name + " não pode votar esse ano!");
        }
        else{
            candidate3.receiveVote();
            candidate3.addElector(elector7);
            candidate6.receiveVote();
            candidate6.addElector(elector7);
            candidate9.receiveVote();
            candidate9.addElector(elector7);
        }
        Elector elector8 = new Elector("Robert", 74);
        if(!elector8.canVote()){
            System.out.println(elector8.name + " não pode votar esse ano!");
        }
        else{
            candidate1.receiveVote();
            candidate1.addElector(elector8);
            candidate4.receiveVote();
            candidate4.addElector(elector8);
            candidate7.receiveVote();
            candidate7.addElector(elector8);
        }
        Elector elector9 = new Elector("Daniel", 39);
        if(!elector9.canVote()){
            System.out.println(elector9.name + " não pode votar esse ano!");
        }
        else{
            candidate2.receiveVote();
            candidate2.addElector(elector9);
            nullOrBlankVonte.insertNullBlankVonte();
            candidate7.receiveVote();
            candidate7.addElector(elector9);
        }
        Elector elector10 = new Elector("Amanda", 37);
        if(!elector10.canVote()){
            System.out.println(elector10.name + " não pode votar esse ano!");
        }
        else{
            candidate2.receiveVote();
            candidate2.addElector(elector10);
            candidate5.receiveVote();
            candidate5.addElector(elector10);
            candidate9.receiveVote();
            candidate9.addElector(elector10);
        }
        
        System.out.println("\nURNA\n");
        System.out.println(ballotBox.getVotes());
        System.out.println("\nPessoas que votaram em cada candidato:");
        candidate1.showElector();
        candidate2.showElector();
        candidate3.showElector();
        candidate4.showElector();
        candidate5.showElector();
        candidate6.showElector();
        candidate7.showElector();
        candidate8.showElector();
        candidate9.showElector();
        System.out.println("Total de votos por candidato:");
        candidate1.showTotalVotes();
        candidate2.showTotalVotes();
        candidate3.showTotalVotes();
        candidate4.showTotalVotes();
        candidate5.showTotalVotes();
        candidate6.showTotalVotes();
        candidate7.showTotalVotes();
        candidate8.showTotalVotes();
        candidate9.showTotalVotes();
    }
}