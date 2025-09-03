import java.util.Scanner;
import java.lang.Math;
public class R21_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :... ");
        int num=sc.nextInt();
        System.out.print("Enter the number of digits in your number :... ");
        int len=sc.nextInt();
        int sum=0,temp=num;
        while (num>0) {
            sum+=Math.pow(num%10,len);
            num/=10;
        }
        if (temp==sum)
            System.out.println(temp+" is an Armstrong number.");
        else
            System.out.println(temp+" is not an Armstrong number.");
        sc.close();
    }
}