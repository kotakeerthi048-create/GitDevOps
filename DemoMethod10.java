import java.util.Scanner;
class PrimeNumbers
{
    int sm = 0;
    int sum(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int count =0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                sm = sm+i;
            }
        }
        return sm;
    }
}
class DemoMethod10
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        PrimeNumbers ob = new PrimeNumbers();
        int res = ob.sum(n);
        System.out.println("Result:"+res);
    }
}