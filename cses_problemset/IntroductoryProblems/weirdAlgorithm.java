
import java.util.*;

public class weirdAlgorithm {

     public static void main(String[] args) {
          
          int n;
          Scanner sc = new Scanner(System.in);
          n = sc.nextInt();

          System.out.print(n);
          while(n != 1){
               if(n %2 == 0) n /= 2;
               else{
                    n = (n*3) + 1;
               }
               System.out.print(" "+n);
          }
     }
}