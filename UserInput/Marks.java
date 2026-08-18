package UserInput;
import java.util.Scanner;

public class Marks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name=sc.nextLine();
        System.out.print("Enter marks scored in Tamil:");
        int tamil=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter marks scored in English:");
        int english=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter marks scored in Maths:");
        int maths=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter marks scored in Science:");
        int science=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter marks scored in Social Science:");
        int socialscience=sc.nextInt();
        sc.nextLine();
        double total=tamil+english+maths+science+socialscience;
        double average=total/5;
        double percentage=(total/500)*100;
        System.out.println("         Student Report");
        System.out.println("Student name: "+name);
        System.out.println("Total marks: "+total);
        System.out.println("Average: "+average);
        System.out.println("Percentage: "+percentage+"%");
    }
}
