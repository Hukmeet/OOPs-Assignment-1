import java.util.Scanner;
public class R23_Matrix_Addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrices :... ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns in the matrices :... ");
        int cols=sc.nextInt();
        int arr1[][]=new int[rows][cols];
        int arr2[][]=new int[rows][cols];
        int arr[][]=new int[rows][cols];
        System.out.println("Enter the elements of the first matrix :");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++)
                arr1[i][j]=sc.nextInt();
        }
        System.out.println("Enter the elements of the second matrix :");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++)
                arr2[i][j]=sc.nextInt();
        }
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++)
                arr[i][j]=arr1[i][j]+arr2[i][j];
        }
        System.out.println("The sum of these two matrices is: ");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
