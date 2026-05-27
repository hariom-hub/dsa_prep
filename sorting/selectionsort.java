import java.util.*;

public class selectionsort {

     public static void SelectionSort(int[] arr, int n) {

          // select min and then swap

          for (int i = 0; i <= n - 2; i++) { // i will go from to n-2 becuase the n-1th element will automatically be
                                             // sorted.
               int min = i;
               for (int j = i; j <n; j++) { // j will move from i to n-1 becuase minimum element can be at the
                                                  // last
                                                  // index of arr

                    if (arr[j] < arr[min]) {
                         min = j;
                    }
               }
               int temp = arr[min];
               arr[min] = arr[i];
               arr[i] = temp;
          }
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }
          SelectionSort(arr, n);
          for (int ele : arr) {
               System.out.print(ele + " ");
          }
     }
}