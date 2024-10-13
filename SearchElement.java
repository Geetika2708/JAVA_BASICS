class Maximum {
    public int maxi() {
        int arr[] = {1, 2, 3, 9, 0, 5, 7};
        int x = 9;
        int ans = -1; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        
        return ans; 
    }
}

public class MaximumArray {
    public static void main(String[] args) {
        Maximum obj1 = new Maximum();
        int result = obj1.maxi(); 
        System.out.println(result); 
    }
}
