/*
INPUTS IN JAVA
 */

import java.util.*;
  public class tut4{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);

      String name= sc.nextLine();
      System.out.println(name);

      int num = sc.nextInt();
      System.out.println(num);

      boolean var = sc.nextBoolean();
      System.out.println(var);

      double price= sc.nextDouble();
      System.out.println(price);

    }

}
/*
BASICALLY THE TYPE OF DATATYPE WHICH WE ARE USING, WE HAVE TO USE THAT DATATYPE AFTER NEXT
EXAMPLE; we want to take integer,floating no., boolean inputs
so we will use

string name= sc.nextLine();
int number= sc.nextInt();
float price= sc.nextFloat();
boolean var= sc.nextBoolean ();
double price= sc.nextDouble ();
 */
