abstract class Employee {
    String name;
    String id;
    String dept;//department
    String desg;//designation
    Employee() {}
    Employee(String name,String id,String dept,String desg) {
        this.name=name;
        this.id=id;
        this.dept=dept;
        this.desg=desg;
    }
    abstract void calculateSalary();
    abstract void displayInfo();
}
class Manager extends Employee {
    int managerSal=25000;
    int emplSal=10000;
    int progmrSal=15000;
    Manager(String name,String id,String dept) {
        this.name=name;
        this.id=id;
        this.dept=dept;
        this .desg="Manager";
    }
    void calculateSalary() {
        switch (desg) {
            case "Manager":
                System.out.println("Monthly Salary: INR"+managerSal);
                break;
            case "Employee":
                System.out.println("Monthly Salary: INR"+emplSal);                
                break;
            case "Programmer":
                System.out.println("Monthly Salary: INR"+progmrSal);
                break;
            default:
                System.out.println("Wrong Desination.");
                break;
        }
    }
    void displayInfo() {
        System.out.println("Displaying Info:\n");
        System.out.println("Name: "+super.name);
        System.out.println("ID: "+super.id);
        System.out.println("Department: "+super.dept);
        System.out.println("Designation: "+super.desg+"\n");
    }
}
class Programmer extends Employee {
    Programmer(String name,String id,String dept,String desg) {
        this.name=name;
        this.id=id;
        this.dept=dept;
        this.desg=desg;
    }
    void calculateSalary() {
        int managerSal=25000;
        int emplSal=10000;
        int progmrSal=15000;
        switch (desg) {
            case "Manager":
                System.out.println("Monthly Salary: INR"+managerSal);
                break;
            case "Employee":
                System.out.println("Monthly Salary: INR"+emplSal);                
                break;
            case "Programmer":
                System.out.println("Monthly Salary: INR"+progmrSal);
                break;
            default:
                System.out.println("Wrong Desination.");
                break;
        }
    }
    void displayInfo() {
        System.out.println("Displaying Info:\n");
        System.out.println("Name: "+super.name);
        System.out.println("ID: "+super.id);
        System.out.println("Department: "+super.dept);
        System.out.println("Designation: "+super.desg+"\n");
    }
}
public class R34_Abstract_Class_Employee {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("\nCreating manager object:\n\n");
        Employee man=new Manager("Mr. Smith","R157AJ","Content");
        man.displayInfo();
        man.calculateSalary();
        System.out.println("------------------------------------------------");
        System.out.println("\nCreating programmer object:\n\n");
        Employee prog=new Programmer("Hacker Bro","R136AH","Technical","Programmer");
        prog.displayInfo();
        prog.calculateSalary();
        System.out.println("------------------------------------------------");

    }
}
