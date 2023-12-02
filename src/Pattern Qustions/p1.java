//Normal Pattern qustion's
// https://docs.google.com/document/d/1OrUsnDqzma9ob467aCdvRlZwkK7mhl552n92vlBXr_U/edit

// Using nested loops=> using multiple loops

/* *****
   *****
   *****
   ***** */
// print this pattern.

import java.util.*;

public class p1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}