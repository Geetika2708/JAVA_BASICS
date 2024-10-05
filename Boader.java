import java.util.Scanner;
public class Boader{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int rows = sc.nextInt();
    int coloumn = sc.nextInt();
    for(int i=1;i<=rows;i++){
      for(int j=1;j<=coloumn;j++){
        if(i==1 && i==rows && j==1 && j==coloumn){
          System.out.print("*");
        } 
        System.out.println(" ");
      }
      System.out.println();
    }
  }
}
