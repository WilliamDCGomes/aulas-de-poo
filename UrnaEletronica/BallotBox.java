public class BallotBox{
    private int votes;
    private int votesBlankOrNull;
    public BallotBox(){
        votes = 0;
        votesBlankOrNull = 0;
    }
    public void receveVotes(){
        votes++;
    }
    public void receveVotesBlankOrNull(){
        votesBlankOrNull++;
    }
    public String getVotes(){
        return "Total de votos Válidos: " + votes + "\nTotal de Votos em branco e nulos: " + votesBlankOrNull;
    }
}
