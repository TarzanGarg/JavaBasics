package practicequestions;
//Var-Args
//Write a method sum(int... nums) that calculates the sum of all integers passed. Test it with 3, 5, and 10 numbers.
class Addition{

    public static int sum(int ... nums){
        int total = 0;
        for (int n: nums){
            total += n;
        }
        return total;
    }
}
public class Question13 {
    public static void main(String args[]){
        Addition a1= new Addition();
        Addition a2= new Addition();
        Addition a3= new Addition();
        System.out.println(a1.sum(3,4,5));
        System.out.println(a2.sum(2,3,4,2,3));
        System.out.println(a3.sum(1,2,3,4,5,6,7,8,9,10));
    }
}
