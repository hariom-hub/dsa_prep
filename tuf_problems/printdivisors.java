

import java.util.*;

public class printdivisors {

    public static void main(String[] args) {

        int n = 36;
//        ArrayList<Integer> divisors = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                divisors.add(i);
//            }
//        }
//        int[] divs = new int[divisors.size()];
//        for (int i = 0; i < divisors.size(); i++) {
//            divs[i] = divisors.get(i);
//        }
//        for (int div : divs) {
//            System.out.print(di " ");
//        }
        //optimized approach by taking the loop upto the square root of n and if n%i != 1 then printing the remaining divisors (logic)
        ArrayList<Integer>ls = new ArrayList<>();

        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                ls.add(i);
                if(n/i != i){
                    ls.add(n/i);
                }
            }
        }

        // TC = O(sqrt(n))

        Collections.sort(ls);
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i)+" ");
        }

    }
}