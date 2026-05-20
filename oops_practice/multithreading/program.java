package oops_practice.multithreading;
import java.lang.Thread;
public class program {

    public static class OS extends Thread{

        @Override
        public void run(){
            for(int i=0;i<10;i++){
                System.out.println("Thread1 is running .....");
            }

            for (int i=0;i<10;i++){
                System.out.println("Thread2 is running....");
            }
        }
    }



    public static void main(String []args){

       OS os = new OS();

       os.start();


    }
}