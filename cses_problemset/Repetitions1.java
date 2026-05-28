import java.util.*;

public class Repetitions1 {

     public static int Solve(String str){

          int count = 1;
          int maxCount = count;
          int n = str.length();
          if(n==0 || n==1) return n;
          for(int i=1;i<n;i++){
               if(str.charAt(i-1) != str.charAt(i)) count = 0;
               count++;
               maxCount = Math.max(count,maxCount);
          }
          return maxCount;
     }

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
          System.out.println(Solve(str));
     }
}