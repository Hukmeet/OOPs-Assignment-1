public class R17_Call_By_Value {
    public static void increment(int a) {
        a++;
        System.out.println("Value of 'a' post increment in increment function: "+a);
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println("Value of 'a' pre increment in main function: "+a);
        increment(a);
        System.out.println("Value of 'a' post increment in main function: "+a);
    }
}