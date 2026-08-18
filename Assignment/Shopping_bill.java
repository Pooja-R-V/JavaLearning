package Assignment;
import java.util.Scanner;
public class Shopping_bill {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer name:");
        String name = sc.nextLine();
        System.out.print("Enter the amount of rice in kg:");
        int rice = sc.nextInt();
        System.out.print("Enter the amount of sugar in kg:");
        int sugar = sc.nextInt();
        System.out.print("Enter the amount of oil in litre:");
        int oil = sc.nextInt();
        int rice_price=58, sugar_price=45, oil_price=180;
        int rice_cost = rice*rice_price;
        int sugar_cost = sugar*sugar_price;
        int oil_cost = oil*oil_price;
        int total_bill = rice_cost+sugar_cost+oil_cost;
        System.out.println("       Shopping Bill");
        System.out.println("Customer: "+name);
        System.out.println("Rice: ₹"+rice_cost);
        System.out.println("Sugar: ₹"+sugar_cost);
        System.out.println("Oil: ₹"+oil_cost);
        System.out.println("Total Bill: ₹"+total_bill);
    }
}
