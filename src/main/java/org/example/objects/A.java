package org.example.objects;

public class A {
    int id;

    public A(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof A other) {
            return this.id == other.id;
        }

        return  false;
    }
}
