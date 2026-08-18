package patterns;

public class Rectangle
{
    public static void main(String[] args)
    {
        int l=6;
        int b=3;
        for(int row=1;row<=b;row++)
        {
            for(int col=1;col<=l;col++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
