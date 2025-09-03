import java.util.Scanner;
public class R19_Factorial {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int n=sc.nextInt();
        int fact=1;
        if (n>=0) {
            if (n==0)
                fact=1;
            else {
                for (int i=1;i<=n;i++)
                    fact*=i;
            }
            System.out.println("The factorial of "+n+" is: "+fact);
        }
        else {
            System.out.println("Enter valid number.");
        }
        sc.close();
    }
}
