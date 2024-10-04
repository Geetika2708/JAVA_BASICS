import java.util.Scanner;
public class MultipleOf5And7{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int i =1;
    while(i!=-1){
      if(i%5==0 && i%7==0){
        System.out.println(i);
        break;
      }
      i++;
    }
  }
}
