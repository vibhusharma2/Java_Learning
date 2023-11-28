// Qustion 1.
// print sum of first n natural numbers.
// where n=4;

/*import java.util.*;
public class qustion_loops{
    public static void main(String[] args){

        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();

        int sum =0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
            System.out.println(sum);
        }


    }
}*/

// Qustion 2.
// print the table of a no. input by the user.

/*import java.util.*;
public class qustion_loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int table = 0;
        for(int i=1; i<20; i++){
            table = n * i ;

            System.out.println(table);
        }

    }
} */

// Q3
// print all the even no. till n?

/*import java.util.*;
public class qustion_loops {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for( int i=0; i<=n; i+=2){
            System.out.println(i);

        }



    }
}
 */
// Q4 Make a Calculator in java;
import java.util.*;


public class qustion_loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();


        /*
         * 1 -> +
         * 2 -> -
         * 3 -> *
         * 4 -> /
         * 5 -> %
         */


        switch (operator) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a / b);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}