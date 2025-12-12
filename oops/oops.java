
// let's study oops
package dsa_prep.oops;
import java.util.*;



public class oops {

    public static class Car {

        String car_name;
        float car_cost;
        String car_number;

        // let's create constructor of class Car


        public void getCarDetails() {

            System.out.println("car name = " + car_name);
            System.out.println("car cost = " + car_cost);
            System.out.println("car number = " + car_number);

        }
    }

    public static void main(String[] args) {

        // main function
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter car details -> Car name, cost and number : ");
        // String car_name = sc.nextLine();
        // float car_cost = sc.nextFloat();
        // sc.nextLine() ;
        // String car_number = sc.nextLine();

        Car obj = new Car(); // object creation

        // obj.CarDetails();
        obj.car_name = "BMW X7";
        obj.car_cost = 13000000;
        obj.car_number = "MP20 18 C7";
        obj.getCarDetails();

    }
}