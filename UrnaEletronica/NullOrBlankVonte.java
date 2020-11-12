public class NullOrBlankVonte{
    BallotBox ballotBox;
    int blankandnull;
    public NullOrBlankVonte(BallotBox ballotBox){
        blankandnull = 0;
        this.ballotBox = ballotBox;
    }
    public void insertNullBlankVonte(){
        blankandnull++;
        ballotBox.receveVotesBlankOrNull();
    }
}
