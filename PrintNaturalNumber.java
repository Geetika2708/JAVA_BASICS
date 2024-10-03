import java.util.Scanner;
public class PrintNaturalNumber{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number :");
    int num = sc.nextInt();
    int start = 1;
    while (start <= num){
System.out.println(start);
      start++;
    }
  }
}
