
import java.util.*;

public class mergesort {

     public static void Merge(int[] arr, int start, int mid, int end) {

          int left = start;
          int right = mid + 1;
          List<Integer>temp = new ArrayList<>();
          while(left <= mid && right <= end){
               if(arr[left] <= arr[right]){
                    temp.add(arr[left]);
                    left++;
               }
               else{
                    temp.add(arr[right]);
                    right++;
               }
          }
          while(left<=mid){
               temp.add(arr[left]);
               left++;
          }
          while (right<=end) {
               temp.add(arr[right]);
               right++;
          }

          for(int i=start;i<=end;i++){
               arr[i] = temp.get(i-start);
          }
     }

     public static void MergeSort(int[] arr, int start, int end) {

          int mid = start + (end - start) / 2;
          if (start >= end) {
               return;
          }

          MergeSort(arr, start, mid);
          MergeSort(arr, mid + 1, end);
          Merge(arr, start, mid, end);

     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }

          MergeSort(arr, 0, n - 1);
          for(int ele : arr)System.out.print(ele+" ");

     }
}