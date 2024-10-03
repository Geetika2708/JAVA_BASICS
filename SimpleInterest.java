// calculate simple interest 

import java.util.Scanner;

public class SimpleInterest{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter principal :");
    int principal = sc.nextInt();
    System.out.println("enter rate : ");
    float rate = sc.nextFloat();
    System.out.println("enter time :");
    float time = sc.nextFloat();
    float simple_interest = principal*rate/time;
    System.out.println("simple interest is  :"+ simple_interest);
  }
}
