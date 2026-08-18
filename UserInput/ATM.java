package UserInput;
import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Account Balance:");
        double balance = sc.nextDouble();
        System.out.print("Enter the Withdrawal Amount:");
        double withdraw = sc.nextDouble();
        if(balance>=withdraw)
        {
            balance = balance-withdraw;
          System.out.println("Withdrawal Successful");
          System.out.println("Remaining balance:"+balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
}
