package dsa_prep.oops;
public class bankaccount {


    public class Bank{

        String user_name;
        private String password;
        double account_balance;

        // getters and seters for password

        public String getpassword(){
            return this.password;
        }

        public void setpassword(String passwrd){
            this.password = passwrd;
        }

    }
    public static void main(String[] args) {
        
        Bank obj = new bankaccount().new Bank();
        obj.user_name = "Hariom";
        System.out.println(obj.user_name);
        obj.setpassword("abcde");
        System.out.println(obj.getpassword());
    }
}