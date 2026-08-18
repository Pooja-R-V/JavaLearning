package UserInput;
import java.util.Scanner;

public class IDCardGenerator
{
    public static void main(String[] args)
    {
      String name;
      int age;
      int year;
      String BG;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter your name:");
      name = sc.nextLine();
        System.out.print("Enter your age:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your year of study:");
        year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your blood group:");
        BG = sc.nextLine();
        System.out.println("         ID card");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Year: "+year);
        System.out.println("Blood Group: "+BG);
    }
}
