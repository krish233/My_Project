import java.util.Scanner;

class Stu1{
    //Attributes
    //Instance variables
    int rollno;
    String name;
    int[] marks;//declaration
    //  Constructor
    Stu1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        name= sc.next();
        System.out.println("Enter the Roll no:");
        rollno= sc.nextInt();
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        marks=new int[size];
        for(int i=0;i< marks.length;i++){
            marks[i]= sc.nextInt();
        }
    }
    //intance area
    public void display(){
        System.out.println(rollno);
        System.out.println(name);
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Stu[] arr = new Stu[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Stu();
        }
        for (Stu stu : arr) {
            stu.display();
        }
    }
}
