import java.util.*;

public class hashString {

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          String str = sc.next();

          // hashing

          // only for lower case
          int []hash = new int[256];

          // precompute

          for(int i=0;i<str.length();i++){
               hash[str.charAt(i) - 'a']++;
          }
          
          int q = sc.nextInt();

          //fetch
          while(q-->0){
               char ch = sc.next().charAt(0);
               System.out.println(hash[ch-'a']);
          }
     }
}