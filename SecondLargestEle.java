
public class SecondLargestEle {
        
    public static int getSecondLargest(int arr[]) {
        int large = -1;
        int secondlarge = -1;
        for (int ele : arr) {
            if (ele > large) {
                secondlarge = large;
                large = ele;
            } else if (ele > secondlarge && ele != large) {
                secondlarge = ele;
            }
        }
        return secondlarge;
    }

    public static void main(String[] args) {
        int arr1[] = {12, 35, 1, 10, 34, 1};
        int arr2[] = {10, 5, 10};
        int arr3[] = {10, 10, 10};

        System.out.println(getSecondLargest(arr1)); // Output: 34
        System.out.println(getSecondLargest(arr2)); // Output: 5
        System.out.println(getSecondLargest(arr3)); // Output: -1
    }
}
