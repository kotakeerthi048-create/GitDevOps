import java.util.Scanner;
class Factorial
{
    int fact = 1;
    int mul(int n)
    {
        for(int i=n;i>=1;i--)
        {
             fact = fact*i;
        }
        return fact;
    }
}
class DemoMethod7
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        Factorial ob = new Factorial();
        int res = ob.mul(n);
        System.out.println("Result:"+res);
    }
}