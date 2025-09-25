import java.util.Scanner;
class Comparision
{
    int Compare(int x,int y,int z)
    {
        if(x>y && x>z)
        {
            return x;
        } 
        else if(y>x && y>z)
        {
            return y;
        }
        else
        {
            return z;
        }
    }
}
class DemoMethod4
{
    public static void main(String[]args)
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the value-1:");
       int v1 = s.nextInt();
        System.out.println("Enter the value-2:");
       int v2 = s.nextInt();
        System.out.println("Enter the value-3:");
       int v3 = s.nextInt();
       Comparision ob = new Comparision();
       int res = ob.Compare(v1,v2,v3);
       System.out.println("GreaterValue:"+res);
    }
}