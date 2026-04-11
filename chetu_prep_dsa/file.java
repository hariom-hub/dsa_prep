package chetu_prep_dsa;
import java.util.*;
public class file{

    public static void swap(int num1, int num2){

        // logic
        System.out.println("Initially num1 = "+num1 + " and num2 = "+num2);
        if(num1 > num2){
           num1 = num1 - num2;
           num2 = num1 + num2;
        }else{
            num2 = num2 - num1;
            num1 = num1 + num2;
        }
        System.out.println("Now, num1 = "+num1 + " and num2 = "+num2);

    }
    public static void main(String[] args){

        // swap two numbers without using a third var
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        swap(num1,num2);
    }
}