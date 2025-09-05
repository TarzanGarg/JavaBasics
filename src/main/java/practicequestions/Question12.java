package practicequestions;
//Custom Exception
//Create a custom exception InvalidAgeException. In a Voting class, throw this exception if the age is less than 18.
class Voting{
    Voting(int a) throws InvalidAgeException{
        if (a<18){
            throw new InvalidAgeException("You are not ready for vote");
        }
        System.out.println("You are ready to vote");
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class Question12 {
    public static void main(String args[]){
        try {
            Voting v1 = new Voting(23);
            Voting v2 = new Voting(32);
            Voting v3 = new Voting(71);
            Voting v4 = new Voting(12);
            Voting v5 = new Voting(24);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
    }
}