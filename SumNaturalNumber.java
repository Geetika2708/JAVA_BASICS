import java.util.Scanner;
public class SumNaturalNumber{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number : ");
    int num = sc.nextInt();
    int sum = 0;
    int start = 1;
    while(start <= num){
      sum = sum + start;
      start++;
    }
    System.out.println(sum);
  }
}
