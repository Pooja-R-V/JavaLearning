package Loops;
import java.util.Scanner;
public class SumNaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i = 1;i <= n;i++)
        {
            sum = i+sum; // sum += i; we can use this
        }
        System.out.println(sum);
    }
}
