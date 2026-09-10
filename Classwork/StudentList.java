package Classwork;
import java.util.Scanner;
public class StudentList {
    public static void main(String[] args)
    {

       for(int i=1;i<=10;i++)
       {
           Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ID:");
         int id = sc.nextInt();
         System.out.println("Enter the name:");
         String name = sc.nextLine();
           System.out.println(" id      name");
           System.out.println(name + " " + id);
    }

    }
}
