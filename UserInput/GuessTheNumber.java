package UserInput;
import java.util.Scanner;
public class GuessTheNumber
{
    public static void main(String[] args)
    {
        int secret_number = 6;
        Scanner sc = new Scanner(System.in);
        System.out.print("guess a number between 0 and 9:");
        int num = sc.nextInt();
        if(num>secret_number)
        {
            System.out.println("Your guess is greater than the secret number:");
        }
        else if(num<secret_number)
        {
            System.out.println("Your guess is less than the secret number:");

        }
        else if(num==secret_number)
        {
            System.out.println("You Won!");
        }
    }
}
