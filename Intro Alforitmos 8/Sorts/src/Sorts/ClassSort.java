package Sorts;

public class ClassSort {
    public static void Sort(int arr[]) {
        Sort(arr, arr.length);
    }

    private static void Sort(int arr[], int len) {
        int i;
        boolean swapped;
        do {
            swapped = false;
            for (i = 1; i <= (len - 1); i++) {
                if (arr[i - 1] > arr[i]) {
                    int tmp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = tmp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
