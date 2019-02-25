package Sorts;

public class InsertionSort {
    public static int[] Sort(int arr[]) {
        return Sort(arr, arr.length);
    }

    private static int[] Sort(int arr[], int len) {
        for (int j = 2; j < len; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i > 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
        return arr;
    }
}
