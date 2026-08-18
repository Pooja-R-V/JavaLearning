package Assignment;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Salary
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Employee Name:");
       String name = sc.nextLine();
       System.out.print("Enter the Basic Salary:");
       double basic = sc.nextInt();
       double hra = 0.20*basic;
       double da = 0.10*basic;
       double pf = 0.05*basic;
       double salary = basic+hra+da-pf;
        System.out.println("     Salary Slip");
        System.out.println("Employee: "+name);
        System.out.println("Basic salary: ₹"+basic);
        System.out.println("HRA: ₹"+hra);
        System.out.println("DA: ₹"+da);
        System.out.println("PF: ₹"+pf);
        System.out.println("Net Salary: ₹"+salary);
    }
}
