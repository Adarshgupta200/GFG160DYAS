class Kadanes_Algorithm {
 
    int maxSubarraySum(int[] arr) {
        // Your code here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum +=arr[i];
            if(max<sum){
                max = sum;
            }
            if(sum<0){
               sum=0; 
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        Kadanes_Algorithm ka = new Kadanes_Algorithm();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = ka.maxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

