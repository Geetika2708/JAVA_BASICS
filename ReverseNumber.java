import java.util.Scanner;
public class ReverseNumber{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int reverse;
    while(num>0){
      reverse = num %10;
      num = num/10;
       System.out.print(reverse);
    }
   
  }
}
