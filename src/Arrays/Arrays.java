/*
Creating an Array (method 1) - with new keyword
Syntax:

int[] marks = new int[3];
marks[0] = 97;
marks[1] = 98;
marks[2] = 95;

Creating an Array (method 2)
int[] marks = {98, 97, 95};

Taking an array as an input and printing its elements

 */
import java.util.*;


public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];


        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }


        //print the numbers in array
        for(int i=0; i<arr.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}

