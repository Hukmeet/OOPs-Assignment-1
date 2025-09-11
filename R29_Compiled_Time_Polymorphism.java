import java.util.Scanner;
class CalcSum{
    public static int add(int a,int b) {
        return (a+b);
    }
    public static double add(double a,double b) {
        return (a+b);
    }
}
public class R29_Compiled_Time_Polymorphism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two integers to be added :");
        System.out.print("Enter first no :... ");
        int a1=sc.nextInt();
        System.out.print("Enter second no :... ");
        int b1=sc.nextInt();
        System.out.println("Sum of "+a1+" and "+b1+" is: "+CalcSum.add(a1,b1));
        System.out.println("Enter the two fractions(in decimal) to be added :");
        System.out.print("Enter first no :... ");
        double a2=sc.nextDouble();
        System.out.print("Enter second no :... ");
        double b2=sc.nextDouble();
        System.out.println("Sum of "+a2+" and "+b2+" is: "+CalcSum.add(a2,b2));
        sc.close();
    }
}