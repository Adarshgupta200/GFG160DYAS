class ReverseArray {

    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        reverse(arr1);
        for (int ele : arr1) {
            System.out.print(ele + " ");
        }
        System.out.println();
        
        int arr2[] = {10, 20, 30, 40};
        reverse(arr2);
        for (int ele : arr2) {
            System.out.print(ele + " ");
        }
    }
}