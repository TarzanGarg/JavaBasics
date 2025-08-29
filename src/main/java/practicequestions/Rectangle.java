package practicequestions;
//Constructors
//Write a class Rectangle with a parameterized constructor that accepts length and width. Add a method area() to return the area.
public class Rectangle {
    public int length;
    public int width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public void rectangleArea(){
        int area = length * width;
        System.out.println("the area of the rectangle is: "+area);
    }
    public static void main(String arg[]){
        Rectangle r1= new Rectangle(2,2);
        Rectangle r2= new Rectangle(5,2);
        r1.rectangleArea();
        r2.rectangleArea();
    }
}
