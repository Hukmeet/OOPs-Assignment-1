import java.util.Scanner;
public class R27_Array_Of_Primitive_Data_Type {
    public static int[] create(int size) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[size];
        System.out.println("Enter the array elements:");
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        sc.close();
        return arr;
    }
    public static void print(int arr[]) {
        for (int i:arr)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements :... ");
        int cnt=sc.nextInt();
        int arr[]=create(cnt);
        System.out.println("Printing Elements: ");
        print(arr);
        sc.close();
    }
}