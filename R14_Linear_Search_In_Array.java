import java.util.Scanner;
public class R14_Linear_Search_In_Array {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :... ");
        int size=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[]=new int[size];
        for (int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter the element to search for :... ");
        int ele=sc.nextInt();
        int index=-1;
        for (int i=0;i<size;i++) {
            if (arr[i]==ele)
                index=i;
        }
        if (index==-1)
            System.out.println("Element not found. ");
        else
            System.out.println("Element found at index : "+index);
        sc.close();
    }
}
