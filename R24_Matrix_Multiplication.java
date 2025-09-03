import java.util.Scanner;
public class R24_Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows in the first matrix :... ");
        int r1=sc.nextInt();
        System.out.print("Enter the number of columns in the first matrix :... ");
        int c1=sc.nextInt();
        System.out.print("Enter the number of rows in the second matrix :... ");
        int r2=sc.nextInt();
        System.out.print("Enter the number of columns in the second matrix :... ");
        int c2=sc.nextInt();
        if (c1!=r2) {
            System.out.println("Cannot Multiply");
            sc.close();
            return;
        }
        int arr1[][]=new int[r1][c1];
        int arr2[][]=new int[r2][c2];
        System.out.println("Enter the elements of the first matrix :");
        for (int i=0;i<r1;i++) {
            for (int j=0;j<c1;j++)
                arr1[i][j]=sc.nextInt();
        }
        System.out.println("Enter the elements of the second matrix :");
        for (int i=0;i<r2;i++) {
            for (int j=0;j<c2;j++)
                arr2[i][j]=sc.nextInt();
        }
        int prod[][]=new int[r1][c2];
        for (int i=0;i<r1;i++) {
            for (int j=0;j<c2;j++) {
                for (int k=0;k<c1;k++)
                    prod[i][j]+=arr1[i][k]*arr2[k][j];
            }
        }
        System.out.println("The product of these two matrices is: ");
        for (int i=0;i<r1;i++) {
            for (int j=0;j<c2;j++)
                System.out.print(prod[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
