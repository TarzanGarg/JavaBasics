package practicequestions;

import java.util.HashSet;

//Collections – Set
//Write a program using a HashSet to store email addresses. Add duplicate emails and demonstrate that duplicates are not stored.
public class Question17 {
    public static void main(String[] args) {
        HashSet<String> emailCollection = new HashSet<>();
        emailCollection.add("tdaif@gmail.com");
        emailCollection.add("tdaif@gmail.com");
        emailCollection.add("tdaif@gmail.com");
        emailCollection.add("if@gmail.com");
        emailCollection.add("aif@gmail.com");
        emailCollection.add("aif@gmail.com");
        emailCollection.add("if@gmail.com");
        emailCollection.add("f@gmail.com");
        emailCollection.add("f@gmail.com");

        for (String emails : emailCollection){
            System.out.println(emails);
        }

    }
}
