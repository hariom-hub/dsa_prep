package chetu_prep_dsa;
import java.util.*;

public  class abstraction {

   public static abstract class Car{

    abstract void Drive();
    abstract void Accelerate();
    public void PlayMusic(){
        System.out.println("Car is playing music.");
    }
    }

    // class fortuner will be an abstract class if it will not implement all the methods of Car class

    public static abstract class fortuner extends Car{
      
         public void Drive(){
            System.out.println("the car is driving.");
        }
    }

    public static class endaevour extends fortuner{ // concrete class of fortuner
        public void Accelerate(){
            System.out.println("Car is accelearting.");
        }
         
    }
    public static void main(String[] args) {

        
        endaevour ed = new endaevour();
        ed.Accelerate();
        ed.Drive();
        

    }
}