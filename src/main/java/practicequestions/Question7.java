package practicequestions;
//changes made
//Method Overriding
//Create a Bird class with a method sound(). Extend it with Parrot and Crow classes, overriding sound(). Demonstrate runtime polymorphism.
class Bird{
    void sound(){

    }
}
class Parrot extends Bird{
    void sound() {
        System.out.println("Parrot speaks");
    }
}
class Crow extends Bird{
    void sound() {
        System.out.println("Crow speaks");
    }
}
public class Question7 {
    public static void main(String args[]){
        Bird b1 = new Parrot();
        Bird b2 = new Crow();
        b1.sound();
        b2.sound();
    }
}
