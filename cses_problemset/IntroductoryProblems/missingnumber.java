
import java.util.*;
public class missingnumber {

     public static long GetMissingNumber(long n, long []nums){

          long numsum = 0;
          long arrsum = 0;
          numsum += (long) (n*(n+1)) / 2;
          for (long l : nums) {
               arrsum += l;
          }

          long ans = numsum - arrsum;
          return ans;


     }

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          long []nums =  new long[n];
          for(int i=0;i<n-1;i++){
               nums[i] = sc.nextLong();
          }
          System.out.println(GetMissingNumber(n,nums));
          sc.close();

     }
}