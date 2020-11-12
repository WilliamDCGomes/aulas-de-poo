public class Person{
    public String name;
    public int age;
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    
    
    public boolean canVote(){
        if(age >= 16){
            return true;
        }
        return false;
    }
}
