// logical operator 

import java.util.Scanner;
public class LogicalOperator{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st number : ");
    int number_1 = sc.nextInt();
    System.out.println("enter 2nd number : ");
    int number_2 = sc.nextInt();
    System.out.println("enter 3rd number : ");
    int number_3 = sc.nextInt();
    System.out.println("LOGICAL AND : " + ((number_1>number_2) && (number_2>number_3)));
    System.out.println("LOGICAL OR : " + ((number_1<number_2) || (number_2<number_3)));
    System.out.println("LOGICAL NOT : " + !(number_1<=number_3));
    
  }
}
