import java.util.*;
public class abstraction {

     abstract static class Details{

          abstract void Implementation();
          abstract int GetKey();
     }

     abstract static class Design extends Details{

          public void Implementation(){
               System.out.println("this is the implementation.");
          }
        
     }



     public static class Harru extends Details{

          public void Implementation(){
               System.out.println("this is the actual implementation.");
          }
          
          public int GetKey(){
               return 20;
          }
     }


     public static void main(String[] args) {
          
          Harru h = new Harru();
         System.out.println( h.GetKey());
         h.Implementation();
     }
}