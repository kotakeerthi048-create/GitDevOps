import java.util.Scanner;
class MultiplesOfThree
{
    int sm = 3;
    int sum(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%3==0)
            {
                sm = sm+i;
            }
        }
        return sm;
    }
}
class DemoMethods8
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value n:");
        int n = s.nextInt();
        MultiplesOfThree ob = new MultiplesOfThree();
        int res = ob.sum(n);
        System.out.println("Result:"+res);
    }
}