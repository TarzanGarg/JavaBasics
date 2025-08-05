package org.example;

import org.example.s8ic.CalcUtils;

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

        int a = CalcUtils.addNumbers(1,2);
        System.out.println(a);
    }
}