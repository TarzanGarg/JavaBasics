package practicequestions;
//Collections – Map
//Create a HashMap<Integer, String> where keys are employee IDs and values are employee names.
//Add 5 employees, then print all entries.
import java.util.HashMap;
import java.util.Map;

public class Question18 {
    public static void main(String[] args) {
        HashMap<Integer,String> employeeList =new HashMap<>();
        employeeList.put(1,"raman");
        employeeList.put(2,"aman");
        employeeList.put(3,"daman");
        employeeList.put(4,"saman");
        employeeList.put(5,"paman");
        employeeList.put(6,"raman");

        for (Map.Entry<Integer, String> emp : employeeList.entrySet()){
            System.out.println(emp);
        }

    }
}