/*
returnType function name( type arg1, type arg2,....){
     Operation
}
 */

/*

import java.util.*;
public class func_1{
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        String name = sc.next();

        printMyName(name); //Call Kiyaa Function koo
    }
}


 */

// Qust.1 Make a function to add 2 number and return the same.

import  java.util.*;
public class func_1 {
    public static int calculateSum(int a, int b){
        Scanner sc = new Scanner (System.in);
        int sum = a+b;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of 2 numbers is : "+ sum);
    }
}
