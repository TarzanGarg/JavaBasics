package utilities;
//Packages
//Create a package utilities with a class MathHelper containing a method factorial(int n). Import and use it in another class.
public class MathHelper {
    public static int factorial(int num){
        int factorialTotal = 1;
        for (int i = num; i >1; i--) {
            factorialTotal *= num;
        }
        return factorialTotal;
    }
}
