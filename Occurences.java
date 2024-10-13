import java.util.*;
class search{
  public int find (){
      Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = 5;
    int count = 0;
    int arr [] = new int[n];
    for(int i =0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }

    for(int i =0;i<arr.length;i++){
      if(arr[i]==x){
        count = count+1;
      }
    }
    return count;
  }
}
public class Occurences{
  public static void main(String[]args){
    
    search obj = new search();
    int total = obj.find();
    System.out.println(total);
  }
}
