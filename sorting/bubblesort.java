import java.util.*;

public class bubblesort {

     public static void BubbleSort(int[] arr, int n) {

          for (int i = n - 1; i >= 1; i--) {
               boolean didSwap = false;
               for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                         // swap
                         
                         int temp = arr[j];
                         arr[j] = arr[j + 1];
                         arr[j + 1] = temp;
                         didSwap = true;
                    }
               }
               if (didSwap == false) {
                   break; 
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

          // bubble sort take the maximum and push it to the last
          BubbleSort(arr, n);

     }
}