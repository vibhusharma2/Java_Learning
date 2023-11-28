import java.util.*;
public class cs3_extended{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //conditions
        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is Greater to b");
        } else {
            System.out.println("a is less than b");

        }
    }
}