package practicequestions;
//Classes & Objects
//Create a Car class with fields brand and year. Instantiate two cars and print their details.

public class Car1{
    private int year;
    private String brand;

    public Car1(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public void carDetails(){
        System.out.println("This Car is "+brand+" and year of manufacturing is "+year);
    }
    public static void main(String arg[]){
        Car1 c1 = new Car1("hyundai",2025);
        Car1 c2 = new Car1("kia",2025);
        c1.carDetails();
        c2.carDetails();
    }
}
