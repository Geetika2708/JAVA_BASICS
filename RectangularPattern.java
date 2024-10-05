import java.util.Scanner;
public class RecgtangularPattern{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int coloumn =sc.nextInt();
    for(int i = 1;i<=rows;i++){
      for(int j=1;j<=coloumn;j++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
