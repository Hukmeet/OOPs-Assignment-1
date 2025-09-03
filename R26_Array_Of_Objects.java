import java.util.Scanner;
class Student {
    String name;
    int rollNo;
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    public void display() {
        System.out.println("Name: "+name+"\tRoll No: "+rollNo);
    }
}
public class R26_Array_Of_Objects {
    public static Student[] create(int size) {
        Scanner sc=new Scanner(System.in);
        Student arr[]=new Student[size];
        for (int i=0;i<size;i++) {
            System.out.println("Enter details for student #"+(i+1)+":");
            System.out.print("\tEnter Name :... ");
            String name = sc.nextLine();
            System.out.print("\tEnter Roll Number :... ");
            int rollNo = sc.nextInt(); 
            sc.nextLine();
            arr[i]=new Student(name,rollNo);
        }
        sc.close();
        return arr;
    }
    public static void print(Student arr[]) {
        for (Student std:arr) {
            std.display();
            System.out.println("-------------------------------------");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students :... ");
        int cnt=sc.nextInt();
        Student arr[]=create(cnt);
        System.out.println("\n\nPrinting Records: ");
        System.out.println("-------------------------------------");
        print(arr);
        sc.close();
    }
}