import java.util.Scanner;
public class R15_Binary_Search_In_Array {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :... ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        boolean valid;
        do {
            valid=true;
            System.out.println("Enter the sorted array elements: ");
            for (int i=0;i<size;i++)
                arr[i]=sc.nextInt();
            for (int i=0;i<size-1;i++) {
                if (arr[i]>arr[i+1]) {
                    valid=false;
                    break;
                }
            }
            if (!valid)
                System.out.println("Invalid!!!");
        }while (!valid);
        System.out.print("Enter the element to search for :... ");
        int ele=sc.nextInt();
        int start=0,stop=size-1,index=-1;
        while (start<=stop) {
            int mid=(start+stop)/2;
            if (ele==arr[mid]) {
                index=mid;
                break;
            }
            else if (ele<arr[mid])
                stop=mid-1;
            else
                start=mid+1;
        }
        if (index==-1)
            System.out.println("Element not found. ");
        else
            System.out.println("Element found at index : "+index);
        sc.close();
    }
}