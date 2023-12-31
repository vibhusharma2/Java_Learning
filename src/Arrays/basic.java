// Update the marks in array by one by using function.

import java.util.*;
public class basic{

    public static int update( int marks []){
        for (int i=0; i< marks.length ; i++ ){
            marks[i]= marks[i] +1 ;
        }
        return 0;
    }
    public static void main( String args []){
        int marks []= { 97, 98, 99 };
        update( marks );
        for (int i=0; i< marks.length ; i++ ){
            System.out.print( marks[i]+ " ");
        }
        System.out.println();



    }
}