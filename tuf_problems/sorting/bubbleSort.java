package sorting;

import java.util.*;

public class bubbleSort {

    public static void BubbleSort(int[] arr, int n) {

        // optimized bubbleSorting algorithm
        for (int i = n - 1; i >= 1; i--) {
            boolean didSwap = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = true;
                }
            }
            if (didSwap == false)
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr, n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}