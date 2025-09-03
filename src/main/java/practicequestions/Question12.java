package practicequestions;
//Custom Exception
//Create a custom exception InvalidAgeException. In a Voting class, throw this exception if the age is less than 18.
class Voting{
    Voting(int a) {
        assert a >=18 : "InvalidAgeException";
        System.out.println("You are ready to vote");
    }
}
public class Question12 {
    public static void main(String args[]){
        Voting v1 = new Voting(23);
        Voting v2 = new Voting(32);
        Voting v3 = new Voting(7);
        Voting v4 = new Voting(12);
        Voting v5 = new Voting(24);
    }
}