import java.lang.Math;
abstract class Shape {
    int numOfEdges;
    Shape() {}
    Shape(int edges) {
        this.numOfEdges=edges;
    }
    abstract double calculateArea();
    abstract double calculatePerimeter();
    abstract void displayInfo();
}
class Circle extends Shape {
    double radius;
    Circle(double rad) {
        this.radius=rad;
        this.numOfEdges=1;
    }
    double calculateArea() {
        return (Math.PI*radius*radius);
    }
    double calculatePerimeter() {
        return (2*Math.PI*radius);
    }
    void displayInfo() {
        System.out.println("This Shape is a Circle. A circle has "+numOfEdges+" edge(s)/side(s).");
        System.out.println("The radius of this circle is: "+radius);
        System.out.println("The area of this circle is: "+this.calculateArea());
        System.out.println("The perimeter/circumference of this circle is: "+this.calculatePerimeter());
    }
}
class Triangle extends Shape {
    double a;
    double b;
    double c;
    double semiP;
    Triangle(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.semiP=(a+b+c)/2;
        this.numOfEdges=3;
    }
    double calculateArea() {
        return (Math.sqrt((semiP*(semiP-a)*(semiP-b)*(semiP-c))));
    }
    double calculatePerimeter() {
        return (a+b+c);
    }
    void displayInfo() {
        System.out.println("This Shape is a Triangle. A trianlge has "+numOfEdges+" edge(s)/side(s).");
        System.out.println("The length of this first side of this trianlge is: "+a);
        System.out.println("The length of this second side of this trianlge is: "+b);
        System.out.println("The length of this third side of this trianlge is: "+c);
        System.out.println("The area of this triangle is: "+this.calculateArea());
        System.out.println("The perimeter of this triangle is: "+this.calculatePerimeter());
    }
}
public class R35_Abstract_Class_Shape {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("\nCreating a Circle:\n\n");
        Shape c=new Circle(1.0);
        c.displayInfo();
        System.out.println("------------------------------------------------");
        System.out.println("\nCreating a Triangle:\n\n");
        Shape t=new Triangle(3,4,5);
        t.displayInfo();
        System.out.println("------------------------------------------------");

    }
}