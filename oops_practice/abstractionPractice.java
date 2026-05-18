package oops_practice;
import java.util.*;

public class abstractionPractice{

    public interface Parent{

        abstract void MakeCircle();
        abstract void MakeSquare(); 
    }

    public static class CreateCircle implements Parent{

        public  void MakeCircle(){
            // take input radius

            System.out.println("Enter the radius of the circle");

            Scanner sc = new Scanner(System.in);
            float rad = sc.nextFloat();

            double area = 3.14 * Math.pow(rad,2);
            System.out.println("Area = "+area);
            sc.close();
        }
        
        public void MakeSquare() {
            // Implementation for MakeSquare
        }
    }
    public static void main(String [] args){

        CreateCircle cc = new CreateCircle();
        cc.MakeCircle();

        
    }
}