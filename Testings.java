import java.util.Scanner;
class Test
{
  boolean check(int n) 
  {
    if(n%2==0)
    {
        return true;
    }
    else
    {
        return false;
    }
  }  
}
class Testings
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value:");
        int v1 = s.nextInt();
        Test ob = new Test();
        boolean res = ob.check(v1);
        System.out.println("Even number:"+res);
    }
}