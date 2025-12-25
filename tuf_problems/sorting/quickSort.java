package sorting;

import java.util.*;

public class quickSort {

    public static int partition(int []arr,int low,int high){

        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i<j){
            while(arr[i] <= pivot && i <= high - 1){
                i++;
            }
            while(arr[j] > arr[pivot] && j >= low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void QuickSort(int[] arr, int low, int high) {

        if (low < high) {
            int partitionIdx = partition(arr, low, high);
            QuickSort(arr, low, partitionIdx - 1);
            QuickSort(arr, partitionIdx + 1, high);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        QuickSort(arr, 0, arr.length - 1);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}