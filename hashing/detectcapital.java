import java.util.*;

public class detectcapital {

     public static boolean DetectCapital(String str) {

          int n = str.length();

          if (Character.isUpperCase(str.charAt(0))) {

               // two cases
               // 1. if the first char is uppercase and all other chars are uppercase

               if (Character.isUpperCase(str.charAt(1))) {

                    for (int i = 2; i < n; i++) {
                         if (Character.isLowerCase(str.charAt(i)))
                              return false;
                    }
               } else {
                    if (Character.isLowerCase(str.charAt(1))) {
                         for (int i = 2; i < n; i++) {
                              if (Character.isUpperCase(str.charAt(i)))
                                   return false;
                         }
                    }
               }
               // 2. if the first char is uppercase and all other chars are lowercase

          } else {

               // means if the first char is lower but the next chars are capital then return
               // false
               for (int i = 1; i < n; i++) {
                    if (Character.isUpperCase(str.charAt(i)))
                         return false;
               }
          }
          return true;
     }

     public static void main(String[] args) throws java.lang.Exception {
          // your code goes here

          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
          System.out.println(DetectCapital(str));

     }
}