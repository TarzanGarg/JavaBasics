package practicequestions;
//Constructor Chaining
//Write a class A with a no-arg constructor that prints "A".
//Extend it with class B which has a parameterized constructor calling super(). Demonstrate constructor chaining.
class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(int a){
        super();
    }
}
public class Question10 {
    public static void main(String[] args) {
        B b1 = new B(3);
        B b2 = new B(3);
        B b3 = new B(3);
        B b4 = new B(3);
    }
}
