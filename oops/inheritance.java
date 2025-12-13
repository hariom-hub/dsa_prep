package dsa_prep.oops;

public class inheritance {

    public class University {

        String univ_name;
        int established_year;
        String location;
        boolean isugc_approved;

        // public void about(){
        // System.out.println("this is a univeristy");
        // }

        University(String univ_name, int established_year, String location, boolean isugc_approved) {
            this.univ_name = univ_name;
            this.established_year = established_year;
            this.location = location;
            this.isugc_approved = isugc_approved;
        }

    }

    public class college extends University {

        college() {

            super("aks university", 2011, "Satna", true);
            System.out.println("college name = " + super.univ_name);
            System.out.println("established year = " + super.established_year);
            System.out.println("location = " + super.location);
            System.out.println("is ugc approved = " + super.isugc_approved);
        }
        // public void aboutCollge() {
        // System.out.println("college name = " + super.univ_name);
        // System.out.println("established year = " + super.established_year);
        // System.out.println("location = " + super.location);
        // System.out.println("is ugc approved = " + super.isugc_approved);
        // }

        // public void about(String clg_name){
        // super.location = "jabalpur";
        // System.out.println("college is located in " + super.location);
        // System.out.println("college name is " + clg_name);
        // }
    }

    public static void main(String[] args) {

        // obj.about("jec jabalpur");

        college obj = new inheritance().new college();

    }

}