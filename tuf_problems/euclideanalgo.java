import java.util.*;

public class euclideanalgo {

    public  static  void main(String[] args){

        int n1 = 15, n2 = 20;

        //euclidean algorithm

        while(n1 > 0 && n2 >0){

            if(n1>n2){
                n1 = n1 % n2;
            }else{
                n2 = n2 % n1;
            }
        }
        if(n1 == 0) System.out.println("gcd = "+n2);
        else System.out.println("gcd = "+n1);
    }
}