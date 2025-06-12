
// User function Template for Java
import java.util.Arrays;
class Minimize_the_hight {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int ans = arr[n-1]-arr[0];
        
        for(int i=0; i<n-1; i++){
            if(arr[i+1]-k<0){
                continue;
            }
            
           int admax = Math.max(arr[i]+k, arr[n-1]-k);
           int admin = Math.min(arr[0]+k, arr[i+1]-k);
           
           
           ans = Math.min(ans, admax-admin);
        }
        return ans;
    }
    public static void main(String[] args) {
        Minimize_the_hight mth = new Minimize_the_hight();
        int[] arr = {1, 5, 15, 10};
        int k = 3;
        int result = mth.getMinDiff(arr, k);
        System.out.println("Minimum Difference: " + result);
    }
}
