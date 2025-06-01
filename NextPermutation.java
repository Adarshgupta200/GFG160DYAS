
class NextPermutation {
    public void NextPermutation(int arr[]){
        int n = arr.length;
        int index = -1;
        for(int i=n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr, 0, n-1);
            return;
        }
        for(int i=n-1; i>index; i--){
            if(arr[i]>arr[index]){
                swap(arr, index, i);
                break;
            }
        }
    }
    public void reverse(int arr[], int start, int end){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 6, 5, 4};
        NextPermutation np = new NextPermutation(); 
        np.NextPermutation(arr1);
        System.out.println("Output 1: " + java.util.Arrays.toString(arr1));
    }
}
