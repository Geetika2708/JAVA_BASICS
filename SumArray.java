class Sum {
  
    public int sum_1() {
        int arr_1[] = {1, 5, 4};
        int result = 0;
        for (int i = 0; i < arr_1.length; i++) {
            result += arr_1[i];
        }
        return result; 
    }

}

public class SumArray {
    public static void main(String[] args) { 
        Sum obj1 = new Sum();
        int total = obj1.sum_1();
        System.out.println(total); 
    }
}
