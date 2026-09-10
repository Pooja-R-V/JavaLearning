package NumberBased;
import java.util.Scanner;
public class NeonNumber
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
   static int square(int num)
   {
       return num*num;
   }
   static boolean isNeonNumber(int num)
   {
       int squareOfNumber = square(num);
       int sum = digitSum(squareOfNumber);
       return num == sum;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number:");
       int num = sc.nextInt();
       if (isNeonNumber(num)) {
           System.out.println("neon number");
       } else {
           System.out.println("not a neon number");
       }
   }
   }

