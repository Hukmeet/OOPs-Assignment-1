class Temp {
    Temp() {
        this(5);
        System.out.println("The Default constructor");
    }
    Temp(int x) {
        this(5, 15);
        System.out.println(x);
    }
    Temp(int x, int y) {
        System.out.println(x * y);
    }
}
public class R39_Constructor_Chaining_Using_this_Keyword {
    public static void main(String[] args) {
        new Temp();
    }
}