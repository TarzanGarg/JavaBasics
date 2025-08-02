package org.example;

public class SuperExample {
    String name1;
    public SuperExample(){}
    public SuperExample(String name1) {
        this.name1 = name1;
    }
}

class Sub extends SuperExample{

    public Sub() {
        super();
    }

    void inputName(String name){
        super.name1= name;
    }

    void printName(){
        System.out.println("super class defined name is: ");
        System.out.println(super.name1);
    }

}