import java.util.*;
public class cs1{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in); // input object
        int age = sc.nextInt();
        //conditional statements
        if(age > 18) {
            System.out.println("adult");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}