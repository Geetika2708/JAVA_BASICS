 //Add two Numbers ?

import java.util.Scanner;
public class AddTwoNumbers{
public static void main (String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st number: " );
int number_1 = sc.nextInt();
System.out.println("enter 2nd number : ");
int number_2 = sc.nextInt();
int sum = number_1 + number_2;
System.out.println("Sum is : " + sum);
}
}
