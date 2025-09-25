import java.util.Scanner;
class SumOfDigits
{
    int sm = 123;
    int sum(int n)
    {
        while(n>0)
        {
        int k = n%10;
        sm = sm+k;
        n = n/10;
        }
       return sm;
    }
}
class DemoMethod5
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values:");
        int v1 = s.nextInt();
        SumOfDigits ob = new SumOfDigits();
        int res = ob.sum(v1);
        System.out.println("SumOfDigits:"+res);
    }
}