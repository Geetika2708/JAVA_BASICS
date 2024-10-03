// arithmetic operator 

import java.util.Scanner;

public class ArithemticOperator {
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter 1st number :");
    float number_1 = sc.nextFloat();
    System.out.println("enter 2nd number :");
    float number_2 = sc.nextFloat();
    System.out.println("ADDITION IS :"+ (number_1 + number_2));
    System.out.println("SUBSTRACTION IS :" + (number_1 - number_2));
    System.out.println("MULTIPLICATION IS :" + (number_1 * number_2));
    System.out.println("DIVISION IS :" + (number_1 / number_2));
    System.out.println("MODULUS IS :" + (number_1 % number_2));
    System.out.println("INCREMENT : " + (++number_1));
    //System.outprintln("DECREMENT :" + (--number_2));
  }
}
