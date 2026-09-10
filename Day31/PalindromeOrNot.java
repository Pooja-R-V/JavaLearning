package Day31;

import java.util.Scanner;

public class PalindromeOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(num!=0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;

        }
        num = temp;
        if(num == rev)
        {
            System.out.println("The number is a palindrome");

        }
        else
        {
            System.out.println("The number is not a palindrome");
        }

    }
}
