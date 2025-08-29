package practicequestions;
//his & super
//Create a base class Person with a constructor accepting name.
// Create a subclass Employee with an additional field salary. Use super to call the parent constructor.
public class Person {
    String name;
    public Person(String name){
        this.name = name;
    }
}
class Employee extends Person {
    int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }
    public void employeeDetail(){
        System.out.println("The name of employee is "+name+" and he's salary is "+salary);
    }
    public static void main(String arg[]){
        Employee p1 = new Employee("Tarzan",250);
        Employee p2 = new Employee("Rajan",200);
        p1.employeeDetail();
        p2.employeeDetail();
    }
}