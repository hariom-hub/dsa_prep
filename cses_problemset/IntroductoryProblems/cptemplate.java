import java.util.*;
import java.io.*;

public class cptemplate {

     // FIX 1: Move these here so BOTH main and PrintArray can access them
     static FastScanner sc = new FastScanner();
     static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

     public static class FastScanner {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer("");

          String next() {
               // FIX 2: Use hasMoreTokens() and handle the null/EOF cleanly
               while (!st.hasMoreTokens()) {
                    try {
                         String line = br.readLine();
                         if (line == null)
                              return null;
                         st = new StringTokenizer(line);
                    } catch (IOException e) {
                         e.printStackTrace();
                    }
               }
               return st.nextToken();
          }

          int nextInt() {
               return Integer.parseInt(next());
          }

          long nextLong() {
               return Long.parseLong(next());
          }

          double nextDouble() {
               return Double.parseDouble(next());
          }

          String nextLine() {
               String str = "";
               try {
                    if (st.hasMoreTokens()) { // Updated to tokens
                         str = st.nextToken("\n");
                    } else {
                         str = br.readLine();
                    }
               } catch (IOException e) {
                    e.printStackTrace();
                }
               return str;
          }
     }

     public static void PrintArray(int[] arr) {
          // This now works perfectly because 'out' is static and global!
          for (int ele : arr) {
               out.print(ele + " ");
          }
          out.println(); // Good practice to add a newline at the end
     }

     public static void main(String[] args) {
          // 'sc' and 'out' are already initialized above

          String str = sc.nextLine();
          
          out.println(str);
          

          // Always close to flush the buffer
          out.close();
     }
}