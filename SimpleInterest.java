// calculate simple interest 

import java.util.Scanner;

public class SimpleInterest{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter principal :");
    int principal = sc.nextInt();
    System.out.println("enter rate : ");
    int rate = sc.nextInt();
    System.out.println("enter time :");
    int time = sc.nextInt();
    int simple_interest = principal*rate/time;
    System.out.println("simple interest is  :"+ simple_interest);
  }
}
