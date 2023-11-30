// print the pattern
/*
  *****
  *   *
  *   *
  *****
*/
import java.util.*;
public class p2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++) {

                // cell=> (i,j)
                if (i == 1 || j == 1 || i == n-1 || j == m-1 ) {
                    System.out.print("*");

                } else {
                    System.out.println(" ");
                }
            }
        }
            System.out.println();

    }
}