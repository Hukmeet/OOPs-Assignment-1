interface Sortable {
    void sort(int[] arr);
}
class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
class SelectionSort implements Sortable {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
public class R43_Sortable_Demo {
    public static void main(String[] args) {
        int arr1[] = {4,3,2,1,0};
        int arr2[] = {9,8,7,6,5};
        System.out.println("arr1:");
        BubbleSort bs = new BubbleSort();
        bs.sort(arr1);
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
        System.out.println("\narr2:");
        SelectionSort ss = new SelectionSort();
        ss.sort(arr2);
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
    }
}