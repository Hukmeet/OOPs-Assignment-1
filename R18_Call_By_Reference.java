public class R18_Call_By_Reference {
    int a;
    public static void increment(R18_Call_By_Reference obj) {
        obj.a++;
        System.out.println("Value of 'a' post increment in increment function: "+obj.a);
    }
    public static void main(String[] args) {
        R18_Call_By_Reference ob=new R18_Call_By_Reference();
        ob.a=5;
        System.out.println("Value of 'a' pre increment in main function: "+ob.a);
        increment(ob);
        System.out.println("Value of 'a' post increment in main function: "+ob.a);
    }    
}
