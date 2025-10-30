interface Dad {
    void father();
}
interface Mom {
    void mother();    
}
class Child {
    void father() {
        System.out.println("Father of the child.");
    }
    void mother() {
        System.out.println("Mother of the child.");
    }
}
public class R46_Multiple_Inheritance_Using_Interfaces {
    public static void main(String[] args) {
        Child baby=new Child();
        baby.father();
        baby.mother();
    }
}