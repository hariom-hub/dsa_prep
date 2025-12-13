import java.util.*;

public  class checkprime {

    public static boolean isPrime(int n){

        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                count++;
                if(n/i != i){
                    count++;
                }
            }
        }
        if (count == 2) return true;
        return false;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}