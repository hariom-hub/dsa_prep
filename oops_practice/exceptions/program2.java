package exceptions;

public class program2 {

     public static void main(String[] args) {

          int[] arr = { 10, 20, 30, 40 };

          System.out.println("hello");
          try{
               System.out.println(arr[10]);
          }catch(ArrayIndexOutOfBoundsException e){
               
               System.out.println(e.getLocalizedMessage());
               
               // System.out.println(e.getMessage());
          }
          
     }
}