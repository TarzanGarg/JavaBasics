package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class TwoSum {

    public void twoAdd(List<Integer> list, int x){
        Map<Integer, Integer> map = new HashMap<>();

        for (int ele : list)
        {
            if (map.containsKey(ele)){
                int count = map.get(ele) + 1;
                map.put(ele, count);
            }
            else {
                map.put(ele, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int z= x- entry.getKey();
            if(z== entry.getKey() ){
                if(entry.getValue()>1){
                    System.out.println("Yes, Pair Exist,("+z+","+z+")");
                }
                else{
                    System.out.println("No, Such pair Exist");
                }
            }
            else if (map.containsKey(z)) {
                System.out.println("Yes, Pair exist,("+entry.getKey()+","+z+")");
            }
        }
    }

    public static void main(String args[]){
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7);
        TwoSum t1 = new TwoSum();
        t1.twoAdd(l1,4);
    }
}

