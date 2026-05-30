import java.util.*;

public class Repetitions {

     public static int CountRepetitions(String str) {

          int maxCount = 0;
          Stack<Character> stk = new Stack<>();

          int n = str.length();
          for (int i = 0; i < n; i++) {
               stk.push(str.charAt(i));
          }
          char prevChar = stk.pop();
          int count = 1;
          if(n==0||n==1)return n;

          while (!stk.isEmpty()) {
               char currChar = stk.pop();
               if (currChar == prevChar) {
                    count++;
               } else {
                    prevChar = currChar;
                    count = 1;
               }
               maxCount = Math.max(maxCount, count);
          }
          return maxCount;
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          String input_str = sc.nextLine();
          System.out.println(CountRepetitions(input_str));
     }
}