package Assignment;
import java.util.Scanner;
public class Restaurant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idly quantity: ");
        int idly = sc.nextInt();
        System.out.print("Dosai quantity: ");
        int dosai = sc.nextInt();
        System.out.print("Vadai quantity: ");
        int vadai = sc.nextInt();
        int idly_cost = idly*12;
        int dosai_cost = dosai*40;
        int vadai_cost = vadai*10;
        double sub_total = idly_cost+vadai_cost+dosai_cost;
        double gst = sub_total*0.05;
        double grand_total = sub_total+gst;
        System.out.println("    BILL");
        System.out.println("Idly(" +idly+"): ₹"+idly_cost);
        System.out.println("Dosai(" +dosai+"): ₹"+dosai_cost);
        System.out.println("Vadai(" +vadai+"): ₹"+vadai_cost);
        System.out.println("Subtotal: ₹"+sub_total);
        System.out.println("GST: ₹"+gst);
        System.out.println("Grand Total: ₹"+grand_total);
    }
}
