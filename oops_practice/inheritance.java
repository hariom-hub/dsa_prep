package oops_practice;

public class inheritance {

    public static class Employee {

        String EmployeeName;

        public Employee() {
            System.out.println("Employee created");
        }

        Employee(String Employeename) {
            this.EmployeeName = Employeename;
        }

        public void printEmployeeName() {
            System.out.println(EmployeeName);
        }
    }

    public static class GrantEmployee extends Employee {

        int GrantId;
        public void printGrantId(){
            System.out.println("GrantID = "+ GrantId);
        }

        GrantEmployee() {
            super("hariomsinghthakur");
            printEmployeeName();
            
        }


        GrantEmployee(GrantEmployee g) {
            super(g.EmployeeName);
            this.GrantId = g.GrantId;
        }

        
    }

    public static void main(String[] args) {
        GrantEmployee g = new GrantEmployee();
        g.GrantId = 101;
        g.printGrantId();
       

    }

}
