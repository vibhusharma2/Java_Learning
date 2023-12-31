import java.net.StandardSocketOptions;
import java.util.*;

public class linearSearch{
//lsearch is a function to do linear  search in the array.
    public static int lsearch (int number[],int key){
        for(int i=0; i< number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static String needSearch( String menu[], String need){
        for (int j = 0; j < menu.length; ++j) {
            if (menu[j].equals(need)) {
                return String.valueOf(j);
            }
        }
        return String.valueOf(-1);

    }

    public static void main(String args[]){
        int number[] = {1,2,3,4,5,6,7,8,9};
        int key = 7;
        String menu[] = {"dosa","Samosa","Chai","Coffee"};
        String need = "chai";


        int index = lsearch(number, key);
        if(index == -1){
            System.out.println( "Key Not Found");
        }else{
            System.out.println( "Key is at index :"+ index);
        }
        String Index = needSearch( menu, need );
        if(Index == String.valueOf(-1) ){
            System.out.println( "Need Not found" );
        }else{
            System.out.println("Need found at :" + Index);

        }
    }
}
