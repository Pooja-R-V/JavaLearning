package UserInput;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number:");
        double num2 = sc.nextDouble();
        System.out.print("Enter Operation:");
        char operator = sc.next().charAt(0);
        double result;
        if(operator == '+')
        {
            result = num1 + num2;
        }
        else if(operator == '-')
        {
            result = num1 - num2;
        }
        else if(operator == '*')
        {
            result = num1 * num2;
        }
        else if(operator == '/')
        {
            result = num1 / num2;
        }
        else if(operator == '%')
        {
            result = num1 % num2;
        }
        else
        {
            result=-1;
            System.out.println("operation not supported");
        }
        System.out.println(num1 + " " + operator + " " + num2 +" = "+ result);
    }

}
