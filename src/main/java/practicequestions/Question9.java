package practicequestions;

//Static Concepts
//Create a class Counter with a static variable count.
//Increment count in the constructor. Create multiple objects and print the value of count.
class Counter{
    static int count;

    Counter(){
        count++;
    }
    void countPrint(){
        System.out.println("Count so far is "+ count);
    }
}
public class Question9 {
    public static void main(String args[]){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
//        Counter c5 = new Counter();
//        Counter c6 = new Counter();
//        Counter c7 = new Counter();
        c3.countPrint();
    }

}
