import java.util.Scanner;
class algebra{
    int sum(int a, int b){
        int result = a+b;
        return result;
    }
}


public class main{
    public static void main(String[]args){
        algebra obj1 = new algebra();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = obj1.sum(a,b);
        System.out.print("the answer is : ");
        System.out.print(answer);
        
        
    }
}
