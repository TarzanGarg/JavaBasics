package practicequestions;
//Strings & Immutability
//Write a program that reverses a string without using built-in reverse methods (use StringBuilder or manual looping).
class StringReversing {
    public String textReverse(String temp){
        StringBuilder s = new StringBuilder();
        char[] chars = temp.toCharArray();
        for (int i = temp.length() - 1; i >= 0 ; i--) {
            s.append(chars[i]);
        }
        return s.toString();
    }
}
public class Question11 {
    public static void main(String[] args) {
        StringReversing s = new StringReversing();
        System.out.println(s.textReverse("Hello World"));
    }
}
