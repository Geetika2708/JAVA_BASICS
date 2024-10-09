class Algebra{
    int a;
    int b;
    
    Algebra(int x,int y){
        System.out.println("heyyyyyyyyyy");
        a=x;
        b=y;
    }
    int sum(){
        return a+b;
    }
     int sub(){
        return a-b;
    }
     int mul(){
        return a*b;
    }
     int div(){
        return a/b;
    }
}
public class heyyy{
    public static void main(String[]args){
        Algebra obj=new Algebra(5,7);
        int sum1 = obj.sum();
        int sub1 = obj.sub();
        int mul1 = obj.mul();
        int div1 = obj.div();
        System.out.println(sum1);
        System.out.println(sub1);
        System.out.println(mul1);
        System.out.println(div1);
        Algebra obj2=new Algebra(15,9);
        int sum11 = obj2.sum();
        int sub11 = obj2.sub();
        int mul11 = obj2.mul();
        int div11= obj2.div();
        System.out.println(sum11);
        System.out.println(sub11);
        System.out.println(mul11);
        System.out.println(div11);
        
    }
}
