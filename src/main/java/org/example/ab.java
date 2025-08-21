package org.example;

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class ab {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom error occurred!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

