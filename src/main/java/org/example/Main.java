package org.example;

import org.example.objects.A;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal();

        Animal animal = new Cat();
        Animal animal2 = new Dog();

        animal.eat();
        animal2.eat();

        ThisExample t1= new ThisExample();
        t1.thisExample(5);
        t1.printX();

        Sub s1 = new Sub();
        s1.inputName("hi");
        s1.printName();
        SuperExample ex = new SuperExample();

        A a= new A(5);
        A b= new A(6);
        System.out.println(a.equals(b));
    }
}