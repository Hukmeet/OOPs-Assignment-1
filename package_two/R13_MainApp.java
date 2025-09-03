package package_two;
import package_one.R13_MyClass;
public class R13_MainApp {
    public static void main(String[] args) {
        System.out.println("Now in MainApp, about to call a method from another package...");
        R13_MyClass obj=new R13_MyClass();
        obj.myMethod();
    }
}