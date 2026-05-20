package exceptions;

import java.util.*;

public class program1 {

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int n1 = sc.nextInt();
          int n2 = sc.nextInt();

          int ans;
          try {

               ans = n1 / n2;
          } catch (ArithmeticException e) {
               System.out.println(e.getMessage());
          } finally {
               System.out.println("Cannot be executed.");
          }

     }
}