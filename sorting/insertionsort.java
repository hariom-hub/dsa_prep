import java.util.*;

public class insertionsort {

     public static void InsertionSort(int[] arr, int n) {

          // take an element and place it to it's correct position
          for (int i = 0; i <= n - 1; i++) {
               int j = i;
               // j-1 should not reach n-1th index otherwise j will be reaching n means index
               // out of bounds

               while (j > 0 && arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    j--;
               }
          }
          for (int ele : arr)
               System.out.print(ele + " ");
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }

          InsertionSort(arr, n);
     }
}