import java.util.Scanner;
public class R22_Solid_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the triangle :... ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            for (int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}