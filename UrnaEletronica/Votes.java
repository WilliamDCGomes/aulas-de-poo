public class Votes{
    BallotBox ballotBox;
    private int votes;
    public Votes(BallotBox ballotBox){
        votes = 0;
        this.ballotBox = ballotBox;
    }
    public void newVote(){
        votes += 1;
        ballotBox.receveVotes();
    }
}
