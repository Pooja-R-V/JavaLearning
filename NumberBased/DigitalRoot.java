package NumberBased;
import java.util.Scanner;
public class DigitalRoot
{
    static int digitSum(int num)
    {
        int sum = 0;
        while(num != 0)
        {
            int rem = num%10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
    static int digitalRoot(int num)
    {
        while(num>=10)
        {
            num = digitSum(num);
        }
        return num;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = digitalRoot(num);
        System.out.println("Digital root is: "+result);
    }
}
