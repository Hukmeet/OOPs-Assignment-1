import java.util.Scanner;
import java.lang.Math;
abstract class Shape {
    abstract double area();
    void display() {
        System.out.println("I am a shape.");
    }
}
class Circle extends Shape {
    double radius;
    double area() {
        return (Math.PI*radius*radius);
    }
}
public class R31_Abstract_Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle sh=new Circle();
        sh.display();
        System.out.print("Enter the radius :...");
        sh.radius=sc.nextDouble();
        System.out.println("Area: "+sh.area());
        sc.close();
    }
}