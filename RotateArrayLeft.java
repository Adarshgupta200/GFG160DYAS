import java.util.Arrays;

class RotateArrayLeft {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;

        // Step 1
        reverse(arr, 0, d - 1);

        // Step 2
        reverse(arr, d, n - 1);

        // Step 3
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int d1 = 2;
        rotateArr(arr1, d1);
        System.out.println("Output 1: " + Arrays.toString(arr1));

        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d2 = 3;
        rotateArr(arr2, d2);
        System.out.println("Output 2: " + Arrays.toString(arr2));

        int[] arr3 = {7, 3, 9, 1};
        int d3 = 9;
        rotateArr(arr3, d3);
        System.out.println("Output 3: " + Arrays.toString(arr3));
    }
}
