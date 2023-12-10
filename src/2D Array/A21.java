// https://docs.google.com/document/d/1XkI6549bd-qDvcUC88WuOW0ISPfrtm-Tk06pt_I-89I/edit
// Creating a 2D Array - with new keyword
//int[][] marks = new int[3][3];

// Taking a matrix as an input and printing its elements.

import java.util.*;


public class A21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();


        int[][] numbers = new int[rows][cols];


        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}