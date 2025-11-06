abstract class Vehicle {
    final int WHEELS = 4; 
    abstract void start(); 
    final void showWheels() { 
        System.out.println("Number of wheels: " + WHEELS);
    } 
} 
class Car extends Vehicle { 
    void start() { 
        System.out.println("Car is starting with a key ignition system."); 
    } 
}
public class R33_Abstract_Class_With_Final_Keyword {
    public static void main(String[] args) { 
        Car c = new Car(); 
        c.start();        
        c.showWheels();    
    }
}