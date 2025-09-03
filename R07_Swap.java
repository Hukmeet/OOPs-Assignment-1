public class R07_Swap {
    public static void main(String args[]) {
        int a=2,b=3;
        int temp=0;
        System.out.println("a="+a+"\tb="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+"\tb="+b);
    }
}