import java.util.Scanner;
public class AgeGroup{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the age : ");
    int age = sc.nextInt();
    if(age <=12 && age >0){
System.out.println(age + " is comes under child.");
    }
    else if (age >12 && age<=18){
      System.out.println(age + " is teenage.");
    }
    else {
      System.out.println(age + " is adult.");
    }
  }
}
