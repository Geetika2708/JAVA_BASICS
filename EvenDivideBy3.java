import java.util.Scanner;
public class EvenDivideBy3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number :");
    int num = sc.nextInt();
    if( num % 2 ==0 && num % 3 ==0){
      System.out.println(num + " is even as well as divisible by 3 ");
    }
    else if (num % 2 ==0 && num % 3 != 0) {
      System.out.println(num + " is even but not divisible by 3 ");
    }
    else if (num % 2 !=0 && num % 3 == 0) {
      System.out.println(num + " is not even but  divisible by 3 ");
    }
    else {
      System.out.println(num + " is not even and not divisible by 3 ");
    }
  }
}
