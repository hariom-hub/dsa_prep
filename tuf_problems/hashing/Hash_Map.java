package hashing;

import java.util.*;

public class Hash_Map {

    public static void main(String[] args) {

        // let's perform hashing using a linkedHashmap

        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> lmap = new LinkedHashMap<>();

        int n = sc.nextInt();
        int[] arr = new int[n];

        // precompute

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // increment frequency for arr[i]
            lmap.put(arr[i], lmap.getOrDefault(arr[i], 0) + 1);
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int nums = sc.nextInt();
            // print frequency or 0 if key not present
            // fetch
            System.out.println(lmap.getOrDefault(nums, 0));
        }

    }
}