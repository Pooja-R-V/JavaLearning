package Assignment;
import java.util.Scanner;
public class Fuel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance:");
        double distance = sc.nextDouble();
        System.out.print("Enter the mileage:");
        double mileage = sc.nextDouble();
        System.out.print("Enter the petrol price:");
        double price = sc.nextDouble();
        double fuel_required = distance/mileage;
        double cost = fuel_required*price;
        System.out.println("         Fuel Report");
        System.out.println("Fuel Required:"+fuel_required);
        System.out.println("Total fuel cost:"+cost);



    }
}
