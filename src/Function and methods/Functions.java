// https://docs.google.com/document/d/1XB2d4kTzhvmMrvYMgy53AzM4q9iDAxQq7pZ69a2IJjs/edit
// q. Write a function to calculate the factorial of a number.
//import java.util.*;
//public class Functions {
    // public static int calculateSum(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }


    // public static int calculateProduct(int a, int b) {
    //    return a * b;
    // }

 
 /*   public static void printFactorial(int n) {
        //loop
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        printFactorial(n);
    }
 }
  */
import java.util.*;
public class Functions {
    public static int printfactorial( int n ){
        if(n<0){
            System.out.println("Invalid Number");
            return 1;
        }else{
            int f =1;
            for(int i=1; i<= n; i++){
                f= f*i;
            }
            System.out.println(f);
            return f;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        printfactorial(n);
    }

}
