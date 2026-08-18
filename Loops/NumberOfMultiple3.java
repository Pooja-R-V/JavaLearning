package Loops;
import java.util.Scanner;
public class NumberOfMultiple3 {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int n = sc.nextInt();
    System.out.print("Enter the divisor:");
    int m = sc.nextInt();
    int count = 0;
    for(int i = 1;i<=n;i++)
    {
        if(i%m==0) {
            count ++;
        }
    }
        System.out.println(count);
}

}
