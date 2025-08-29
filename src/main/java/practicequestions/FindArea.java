package practicequestions;
//Question 4
//Abstraction
//Define an abstract class Shape with an abstract method area(). Implement it in Circle and Square classes.
abstract class Shape {

    abstract double area();
}

class Circle extends Shape{
    double radius;

    Circle(double r){
        radius = r;
    }

    double area(){
        return Math.PI * radius * radius;
    }
}

class Square extends Shape{
    int side;

    Square(int s){
        side = s;
    }
    double area(){
        return side * side;
    }
}
public class FindArea{
    public static void main(String arg[]){
        Shape c1 = new Circle(2.4);
        Shape s1 = new Square(2);

        System.out.println("Area of circle : "+ c1.area());
        System.out.println("Area of square : "+ s1.area());
    }

}
