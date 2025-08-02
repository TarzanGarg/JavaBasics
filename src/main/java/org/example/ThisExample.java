package org.example;

public class ThisExample {
    int x;
    void thisExample(int x){
        this.x = x;
    }
    void printX(){
        System.out.println("this is the entered value: ");
        System.out.println(this.x);
    }
}
