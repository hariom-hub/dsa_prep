import java.util.*;

public class IncreasingArray {

     public static long CountMoves(int[] arr, int n) {

          long moves = 0;
          for (int i = 1; i < n; i++) {
               if (arr[i] < arr[i - 1]) {
                    moves += arr[i-1] - arr[i];
                    arr[i] = arr[i-1];
               }
          }
          return moves;
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); // array size
          int []arr = new int[n];
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }

          System.out.println(CountMoves(arr, n));
     }
}