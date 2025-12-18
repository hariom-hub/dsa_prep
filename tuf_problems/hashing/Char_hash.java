package hashing;

import java.util.*;

public class Char_hash {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();

        int[] hash = new int[26];

        // precompute
        for (int i = 0; i < n; i++) {
            hash[s.charAt(i) - 'a']++;
        }

        int query = sc.nextInt();
        while (query-- > 0) {
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch-'a']);
        }
    }
}