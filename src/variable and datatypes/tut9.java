//TYPE CASTING

import java.util.*;
public class tut9{
    public static void main(String args[] ){
        Scanner sc= new Scanner(System.in);

        /*
       float a= 25.6577f;
       int b= a;
       java: incompatible types: possible lossy conversion from double to float
         */

        float a= 25.6577f;
        int b= (int)a;



        System.out.println(b);

    //EVERY CHARACTER HAS A EXACT MATHEMATICAL VALUE IN NUMBERS
        // a=97,b=98,c=99.......values

        char ch= 'x';
        char ch2= 'y';
        int num = ch;
        int num2 = ch2;
        System.out.println(num);
        System.out.println(num2);




    }
}