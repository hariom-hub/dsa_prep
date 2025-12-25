package hashing;

import java.util.*;

public class Char_hash {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();

        int[] hash = new int[256]; // total no. of chars = 256

        // precompute
        for (int i = 0; i < n; i++) {
            hash[s.charAt(i)]++; 
            //auto castes into an integer
        }

        int query = sc.nextInt();
        while (query-- > 0) {
            int i=0;
            String query_string = sc.nextLine();
            char ch = query_string.charAt(i);
            System.out.println(hash[ch]);
        }
    }
}