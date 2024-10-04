import java.util.Scanner;
public class PrintreverseNumber{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int start = sc.nextInt();
    int end = sc.nextInt();
for(int i = start; i>=end;i--){
  System.out.println(i);
}
  }
}
