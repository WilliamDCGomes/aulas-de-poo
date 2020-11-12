public class Elector extends Person{
    public Elector(String name, int age){
        super(name, age);
    }
    @Override
    public boolean canVote(){
        if(age >= 16){
            return true;
        }
        return false;
    }
}
