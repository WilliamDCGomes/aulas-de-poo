import java.util.ArrayList;
import java.util.List;
public class Candidate extends Person implements CandidateTo{
    Votes votes;
    int vote;
    String position;
    List<Elector> whoVoted = new ArrayList<Elector>();
    public Candidate(String name, int age, BallotBox ballotBox){
        super(name, age);
        votes = new Votes(ballotBox);
        vote = 0;
    }
    
    public void showTotalVotes(){
        if(vote==0){
            System.out.println("Candidato " + name + " obteve 0 votos");
        }
        else{
            System.out.println("Candidato " + name + " obteve " + vote + " votos");
        }
    }
    
    public void addElector(Elector elector){
        whoVoted.add(elector);
    }
    
    public void showElector(){
        if(whoVoted.size()!=0){
            System.out.println("Candidato: " + name + "\nPessoas que votaram:");
            for(int i=0; i<whoVoted.size(); i++){
                System.out.println(whoVoted.get(i).name);
            }
            System.out.println("");
        }
        else{
            System.out.println("O candidato " + name + " não recebeu nenhum voto!");
        }
    }
    
    @Override
    public void positionOfCandidate(String position){
        this.position = position;
    }
    
    @Override
    public void receiveVote(){
        vote++;
        votes.newVote();
    }
}
