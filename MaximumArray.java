class Maximum{
  public int maxi(){
    int arr [] = {1,2,3,9,0,5,7};
    int ans = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > ans){
        ans = arr[i];
      }
     
    }
     return ans;
  }
}


public class MaximumArray{
  public static void main(String[]args){
    Maximum obj1 = new Maximum();
    int maxiii = obj1.maxi();
    System.out.println(maxiii);
  }
}
