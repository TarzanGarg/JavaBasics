package org.example;

import java.util.*;

public class SortingExample {
    public static void main(String args[]){

        List<Integer> numbers= new ArrayList<>(Arrays.asList(4,2,6,3,9,1,8,34,5,41));
        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);

        List<String> namesList = new ArrayList<>(Arrays.asList("tarzan","varun","Tarzan","Varun","Vikram"));
        Collections.sort(namesList);
        System.out.println(namesList);

    }
}
