package Assignment;
import java.util.Scanner;
public class Cake
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Cake Price:");
      double price = sc.nextInt();
      System.out.print("Enter the Number of Friends:");
      int friends = sc.nextInt();
      double per_friend = price/friends;
      System.out.println("Birthday Celebration");
      System.out.println("Cake Price: ₹"+price);
      System.out.println("Friends: "+friends);
      System.out.println("Each Friend Should Pay: ₹"+per_friend);
    }
}
