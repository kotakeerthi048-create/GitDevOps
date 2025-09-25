import java.util.Scanner;
class ReversNumbers
{
    int rev = 0;
    int revers(int n)
    {
       for(int i=1;i<=n;i--)
       {
          rev = (rev*10)+n;
       }
       return rev;
    }
}
class DemoMethod11 
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        ReversNumbers ob = new ReversNumbers();
        int res = ob.revers(n);
        System.out.println("Result:"+res);
    }
}