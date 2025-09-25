import java.util.Scanner;
class Reverse
{
    int rev = 0;
    int cal(int n)
    {
        while(n>0)
        {
            int k = n%10;
            rev = (rev*10)+k;
            n = n/10; 
        }
        return rev;
    }
}
class DemoMethod8
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        Reverse ob = new Reverse();
        int res = ob.cal(n);
        System.out.println("Result:"+res);
    }
}