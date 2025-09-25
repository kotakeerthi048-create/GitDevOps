import java.util.Scanner;
class SumOfNumbers
{
    int sm = 0;
    int sum(int n)
    {
        for(int i=1;i<=n;i++)
        {
            sm = sm+i;
        }
        return sm;
    }
}
class DemoMethod6
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        SumOfNumbers ob = new SumOfNumbers();
        int res = ob.sum(n);
        System.out.println("Result:"+res);
    }
}