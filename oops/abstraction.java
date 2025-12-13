// abstraction implementation in java using abstract class AND interfaces
package dsa_prep.oops;

public class abstraction {

    static interface Animal {

        public void walk();

        static int a = 20;

    }

    class leopard implements Animal {

        public void walk() {

            System.out.println("leopard walks on four legs");
        }
    }

    class Dog implements Animal {
        public void walk() {
            System.out.println("Dog walks on four legs");
        }
    }
    // abstract class Animal{

    // abstract void walk();
    // }

    // public class Horse extends Animal{
    // public void walk(){
    // System.out.println("Horses uses four legs to walk");
    // }
    // }

    // public class Gorilla extends Animal{
    // public void walk(){
    // System.out.println("Gorilla uses two legs to walk");
    // }
    // }

    // using interface for absraction

    public static void main(String[] args) {

        // Horse hr = new abstraction().new Horse();
        // hr.walk();
        // Gorilla gr = new abstraction().new Gorilla();
        // gr.walk();
        leopard lp = new abstraction().new leopard();
        lp.walk();
        Dog dg = new abstraction().new Dog();
        dg.walk();

    }
}
