package chetu_prep_dsa;
import java.util.*;
public class rmdupliarr {

    public static void removeDuplicatesfromArray(int n, int []arr){

      Stack<Integer>stk= new Stack<>();
      for(int i=0;i<n;i++){
        if(!stk.contains(arr[i])){
            stk.push(arr[i]);
        }
      }
      System.out.println(stk);
      System.out.println(stk.size());
    }

    public static int solution(int n,int []arr){


        int i = 0;
        for(int j=1;j<n;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        removeDuplicatesfromArray(n,arr);
    }
}