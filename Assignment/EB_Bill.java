package Assignment;
import java.sql.SQLOutput;
import java.util.Scanner;
public class EB_Bill
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Consumer Name:");
       String name = sc.nextLine();
       System.out.print("Enter the Units Consumed:");
       int units = sc.nextInt();
       int bill = units*8;
       double tax = bill*0.18;
       double amount = bill+tax;
       System.out.println("      Electricity Bill");
       System.out.println("Consumer: "+name);
       System.out.println("Units: "+units);
       System.out.println("Current Bill: ₹"+bill);
       System.out.println("Tax: ₹"+tax);
       System.out.println("Total Payable: ₹"+amount);
    }
}
