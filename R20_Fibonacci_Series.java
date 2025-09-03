import java.util.Scanner;
public class R20_Fibonacci_Series {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit :... ");
        int n=sc.nextInt();
        int a=0,b=1,m;
        System.out.println("The series oes like: ");
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=2;i<n;i++) {
            m=a+b;
            System.out.print(m+" ");
            a=b;
            b=m;
        }
        System.out.print("...");
        sc.close();
    }
}
