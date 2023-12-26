// prime no. check
// Optimised prime no. check
// prime no. in range

/*import java.util.*;
public class Prime{

    public static Boolean isPrime( int n){
        if ( n==2){
            return True;
        }
        Boolean isPrime = true;

        for( int i= 2; i<= n-1 ; i++ ){
            if( n % i == 0){ // Completly divisible
                isPrime = false;
                break; //return false; instead of isPrime = false break;
            }
        }
        return isPrime;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in );
        int n = sc.nextInt();

        System.out.println(isPrime(n));

    }
}
 */


//Optimised prime no. check

import java.util.*;
public class Prime{

    public static Boolean isPrime( int n){
        if ( n==2){
            return true;
        }
        Boolean isPrime = true;

        for( int i= 2; i<= Math.sqrt(n) ; i++ ){
            if( n % i == 0){ // Completly divisible
                isPrime = false;
                break; //return false; instead of isPrime = false break;
            }
        }
        return isPrime;


   /* public static void main (String args[]){
        Scanner sc = new Scanner(System.in );
        int n = sc.nextInt();

        System.out.println(isPrime(n)); */

    }

 // prime no. in range
    public static void primeInRange(int n){
        for(int i =2; i <=n; i++){
            if(isPrime(i)) {
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in );
        int n = sc.nextInt();
        primeInRange (n);
    }
}

// Printing Range of prime no. by using isPrime function which is already defined above.