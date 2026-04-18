package chetu_prep_dsa;
import java.util.*;
public class checkpalindrome {


    public static boolean Checkpalindrome_String(String str){

        char []stringArr = str.toCharArray();
        int left = 0;
        int right = stringArr.length - 1;
        while(left <= right){
            if(stringArr[left] != stringArr[right]) return false;
            left++;
            right--;
        }
        return true;
    }


 public static boolean cpinteger(int num){

    // palindrome means original and reversed number should be same

    // that's why first reverse number and then compare the original number and reversed number

    int originalNum = num;
    int reversedNum = 0;

    while (num > 0) {
        int lastdigit = num % 10;
        reversedNum = reversedNum * 10 + lastdigit;
        num = num / 10;
    }
    return reversedNum == originalNum;
 }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // System.out.println(Checkpalindrome_String(str));
        int num = sc.nextInt();
        System.out.println(cpinteger(num));



    }
}