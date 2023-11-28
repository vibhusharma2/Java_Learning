import java.util.*;

// Using if else to choosing button.
public class cs4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button==1){
            System.out.println("Hello");
        }else if (button ==2){
            System.out.println("Namastay");
        }else if (button ==3){
            System.out.println("Bonjour");
        }else{
            System.out.println("Invalid Button");
        }

    }
}