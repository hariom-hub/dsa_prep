public class gcd {

    public static void main(String[] args) {

        //calculate gcd of two nums
        int n1 = 20;
        int n2 = 15;
        int _gcd = 1;
        //optimal approach tc -> O(min(n1,n2))
//        for(int i=Math.min(n1,n2);i>=1;i--){
//            if(n1 % i == 0 && n2 % i == 0){
//                _gcd = i;
//                System.out.println("gcd of " + n1 + " and "+n2 + " is "+ _gcd);
//                break;
//            }
//        }
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if(n1%i == 0 && n2%i == 0){
                _gcd = i;
            }
        }
        System.out.println("gcd of " + n1 + " and "+n2 + " is "+ _gcd);

    }
}