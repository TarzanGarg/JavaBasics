package org.example;
// abstract class example
public abstract class Animal {
    public abstract void makeSound();
    public void eat(){
        System.out.println("eat");
    }
}
class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("bao bao");
    }

    @Override
    public void eat() {
        System.out.println("Zzzzzz....");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Mew");
    }
    @Override
    public void eat() {
        System.out.println("Ummmm....");
    }
}