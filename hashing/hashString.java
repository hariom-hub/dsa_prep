import java.util.*;

public class hashString {

     // max array size outside main = 10^7

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          String str = sc.next();


          // max array size in main = 10^6

          // hashing

          // only for lower case
          int []hash = new int[256];

          // precompute

          for(int i=0;i<str.length();i++){
               hash[str.charAt(i)]++;
          }
          
          int q = sc.nextInt();

          //fetch
          while(q-->0){
               char ch = sc.next().charAt(0);
               System.out.println(hash[ch]);
          }
     }
}