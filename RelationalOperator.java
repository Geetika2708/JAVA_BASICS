// relational operator 

import java.util.Scanner;
public class RelationalOperator{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st number : ");
    float number_1 = sc.nextFloat();
    System.out.println("enter 2nd number : ");
    float number_2 = sc.nextFloat();
    System.out.println("is equals to : " + (number_1 == number_2));
    System.out.println("not equals to : " + (number_1 != number_2));
    System.out.println("greater than : " + (number_1 > number_2));
    System.out.println("lesser than : " + (number_1 < number_2));
    System.out.println("greater than equals to : " + (number_1 >= number_2));
    System.out.println("lesser than equals to : " + (number_1 <= number_2));
  }
  
}
