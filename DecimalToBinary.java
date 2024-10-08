import java.util.Scanner;
public class DecimalToBinary{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int decimal_num = sc.nextInt();
        int result = 0;
        int power =1;
        while(decimal_num>0){
            int parity =decimal_num %2;
            result += (parity*power);
            decimal_num /=2;
            power *=10;
        }
        System.out.println(result);
        
    }
}
