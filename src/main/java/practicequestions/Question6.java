package practicequestions;
//Create a class Calculator with overloaded add() methods to handle:
//two integers
//two doubles
//three integers
class Calculator{
    int add(int a, int b){
        int sum;
        return sum = a + b;
    }
    double add(double a, double b){
        double sum;
        return sum = a + b;

    }
    int add(int a, int b, int c){
        int sum;
        return sum = a+b+c;
    }
}
public class Question6 {
    public static void main(String args[]){
        Calculator c1= new Calculator();
        Calculator c2= new Calculator();
        Calculator c3= new Calculator();

        System.out.println("Two integer sum is : " + c1.add(2,3));
        System.out.println("Two double sum is : " + c2.add(2.0,5.0));
        System.out.println("Three integer sum is : " + c3.add(2,4,5));


    }
}
