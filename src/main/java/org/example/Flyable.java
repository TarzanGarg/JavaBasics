package org.example;

public interface Flyable {
    void fly();
    void wings();
}

class Bird extends Animal implements Flyable{

    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void wings() {

    }
}