 package chetu_prep_dsa;
import java.util.*;
public class reverseString {


    public static void reverse(String str){


        // int left = 0;
        // int right = str.length()-1;

        // char []stringarr = str.toCharArray();

        // while(left <= right){
        //     char ch = stringarr[left];
        //     stringarr[left] = stringarr[right];
        //     stringarr[right] = ch;
        //     left++;
        //     right--;
        // }
        // System.out.println(stringarr);
        StringBuilder sb = new StringBuilder();
        Stack<Character>stk = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            stk.push(ch);
        }
        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        // reverse string using two pointer
        reverse(s);
    }
    
}