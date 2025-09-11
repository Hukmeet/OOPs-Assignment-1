class Shape {
    void display() {
        System.out.println("I am a Shape.");
    }
}
class Circle extends Shape {
    void display() {
        System.out.println("I am the Shape Circle.");
    }
}
class Triangle extends Shape {
    void display() {
        System.out.println("I am the Shape Triangle.");
    }
}
public class R30_Run_Time_Polymorphism {
    public static void main(String[] args) {
        Shape sh;
        sh=new Shape();
        sh.display();
        sh=new Circle();
        sh.display();
        sh=new Triangle();
        sh.display();
    }
}