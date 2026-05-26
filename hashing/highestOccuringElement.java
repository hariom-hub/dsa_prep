import java.util.*;

public class highestOccuringElement {

     // hashing of integers, boolean and character values using hash[] array method
     // is valid till the array elements size in main is 10^6 and outside main is
     // 10^7

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] nums = new int[n];
          for (int i = 0; i < n; i++) {
               nums[i] = sc.nextInt();
          }
          // Arrays.sort(nums);
          int hashsize = nums[0];
          for (int i = 1; i < n; i++) {
               if (nums[i] > hashsize)
                    hashsize = nums[i];
          }
          int[] hash = new int[hashsize + 1];

          // precompute

          for (int i = 0; i < n; i++) {
               hash[nums[i]]++;
          }

          int ans = nums[0];
          for (int i = 1; i < n; i++) {

               if (hash[nums[i - 1]] < hash[nums[i]]) {

                    // we will not update the ans if the i-1th element is higher in frequency than
                    // the ith element and if the i-1th element has the same frequency as the ith
                    // element bcoz we want to return the minimum number with highest frequency
                    ans = nums[i];
               }
          }
          System.out.println(ans);
     }
}
