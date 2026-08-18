package Day12Handson;

public class NestedLoop
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.printf("i=%d, j=%d\n",i,j);
            }
        }
    }
}
