// Finding Maximum and Minimum value in the Array.
public class bignSmallNum {
    /*
    public static int LargestNumber(int number[]){
        for( int i=0; i< number.length; i++ ){
            if (number[i] > number[i+1]){
                return number[i];
            } else{
                return number[i+1];
            }
        }
    }

    public static void main(String args[]){
        int number[] = { 1,2,6,3,5};
        System.out.println("Largest number in Array is :" + LargestNumber( number[] ));


    }
}
*/
    public static int getLargest(int numbers[]){

        int largest = Integer.MIN_VALUE; // (-)Infinity for finding Largest number in array.
        int smallest= Integer.MAX_VALUE; // (+)Infinity for finding smallest number in array.

        for (int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest num in array is :"+ smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest no. in array is :"+ getLargest(numbers));

    }
}