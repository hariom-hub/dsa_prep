
import java.util.*;
import java.lang.*;
import java.io.*;

public class countfreq {

     public static List<List<Integer>> CountFreq(int[] nums, int n) {

          HashMap<Integer, Integer> map = new HashMap<>();

          for (int i = 0; i < n; i++) {
               map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
          }
          List<List<Integer>> ans = new ArrayList<>();

          // iterate over a map
          
         for(Map.Entry<Integer,Integer>it:map.entrySet()){
             List<Integer>pair = new ArrayList<>();
             pair.add(it.getKey());
             pair.add(it.getValue());
             ans.add(pair);
         }
          return ans;

     }

     public static void main(String[] args) {
          // your code goes here
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] nums = new int[n];

          for (int i = 0; i < n; i++) {
               nums[i] = sc.nextInt();
          }

          System.out.println(CountFreq(nums, n));

     }
}
