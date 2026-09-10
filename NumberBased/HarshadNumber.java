package NumberBased;
import java.util.Scanner;
public class HarshadNumber
{
    static int digitSum(int num)
    {
        int sum = 0;
        while (num != 0)
        {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
    static boolean isHarshadNumber(int num)
    {
        int sum = digitSum(num);
       return num % sum == 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        boolean result = isHarshadNumber(num);
        if(result)
        {
            System.out.println("Harshad number");
        }
        else
        {
            System.out.println("Not a Harshad number");
        }

    }
}
