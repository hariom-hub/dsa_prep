import java.util.*;

public class hash {

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          // size of the array
          int n = sc.nextInt();
          // input array
          int[] arr = new int[n];
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }

          int hashsize = arr[0];
          for (int i = 1; i < n; i++) {
               if (arr[i] > hashsize)
                    hashsize = arr[i];
          }
          // precompute

          int hashArray[] = new int[hashsize+1];

          for (int i = 0; i < n; i++) {
               hashArray[arr[i]]++;
          }

          // take query
          int q = sc.nextInt();
          while (q-- > 0) {
               
               int q_num = sc.nextInt();
               // fetch
               
               System.out.println("Freq = "+hashArray[q_num]);
          }
          sc.close();
     }
}