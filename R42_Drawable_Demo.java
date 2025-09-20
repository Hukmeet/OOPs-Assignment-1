interface Drawable {
    void draw();
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("Circle Drawn");
    }
}
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Rectangle Drawn");
    }
}
class Triangle implements Drawable {
    public void draw() {
        System.out.println("Triangle Drawn");
    }
}
public class R42_Drawable_Demo {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();
        Triangle t = new Triangle();
        t.draw();
    }
}