package Day29;
import java.util.Scanner;
public class CountNoOfOddAndEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int odd = 0;
        int even = 0;
        while(num>0)
        {
          int digit = num%10;
          if(digit%2 == 0)
          {
              even+=1;
          }
          else
          {
              odd+=1;
          }
          num = num/10;
        }
        System.out.println("Odd Count: "+odd);
        System.out.println("Even Count: "+even);
    }
}
