package practicequestions;
//Collections – List
//Create an ArrayList of student names. Add at least 5 names, sort them alphabetically, and print them.
import java.util.ArrayList;
import java.util.Collections;

public class Question16 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("raman");
        studentNames.add("aman");
        studentNames.add("naman");
        studentNames.add("param");
        studentNames.add("sanam");
        Collections.sort(studentNames);
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}