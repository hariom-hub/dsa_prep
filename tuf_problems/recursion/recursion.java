package recursion;

import java.util.*;

public class recursion {

    // static int count = 0;
    // public static void printName() {

    // System.out.println("Hariom");
    // count++;
    // if(count == 5){
    // return;
    // }
    // printName();
    // }

    public static void NtoOne(int n) {

        System.out.println(n);
        if (n == 1) {
            return;
        }
        NtoOne(n - 1);
    }

    public static void OnetoN(int n) {

        if (n == 0) {
            return;
        }

        OnetoN(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer : ");
        int n = sc.nextInt();
        OnetoN(n);
    }
}