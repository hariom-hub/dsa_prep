package hashing;

import java.util.*;

public class hash_arr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q = sc.nextInt();
        while (q --> 0) {
            int q_nums = sc.nextInt();
            System.out.println(hash[q_nums]);
        }

    }
}