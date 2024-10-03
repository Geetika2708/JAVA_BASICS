// bitwise operator 

public class BitwiseOperator{
  public static void main (String[]args){
    int num_1 = 9;
    int num_2 = 8;
    System.out.println("Bitwise OR : " + (num_1 | num_2));
    System.out.println("Bitwise AND : " + (num_1 & num_2));
    System.out.println("Bitwise XOR : " + (num_1 ^ num_2));
    System.out.println("Bitwise COMPLEMENT : " + ~(num_1));
    System.out.println("LEFT SHIFT : " + (num_2<<2));
    System.out.println("RIGHT SHIFT : " + (num_1>>2));
  }
}
