package methodss;

public class Reverse
{
    static int reverse(int num)
    {
        int rev = 0;
        while(num!=0)
        {
            int rem = num % 10;
            rev = (10*rev) + rem;
            num = num/10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        int num1 = 567;
        int num2 = 453;
        int num3 = 789;
        System.out.println(reverse(num1));
        System.out.println(reverse(num2));
        System.out.println(reverse(num3));
    }
}
