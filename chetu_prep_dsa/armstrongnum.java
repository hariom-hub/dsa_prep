package chetu_prep_dsa;
import java.util.*;
public class armstrongnum {

    public static boolean checkarmstrong(int n){

        int sum = 0;
        int original_num = n;

        while(n>0){
           int lastdigit = n % 10;
           sum += cube(lastdigit);
           n = n / 10;
        }
        return sum == original_num;
    }

    public static int cube(int n){
        return n*n*n;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkarmstrong(n));
    }
}