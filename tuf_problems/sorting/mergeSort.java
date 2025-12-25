package sorting;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    public static void Merge(int[] arr, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        // sorting and then merging elements

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // storing the remaining elements
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public static void mergeSort(int[] arr, int low, int high) {

        // base case
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        Merge(arr, low, mid, high);

    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        // merge short
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}