import java.util.Scanner;
class Addition
{
    int add(int x,int y)
    {
        return x+y;
    }
} 
class Subtraction
{
    int sub(int x,int y)
    {
        return x-y;
    }  
}
class Multiplication
{
    int mul(int x,int y)
    {
        return x*y;
    }
}
class Division
{
    float div(int x,int y)
    {
        return (float)x/y;
    }
}
class ModDivision
{
    int moddiv(int x,int y)
    {
        return x%y;
    }
}

class DemoMethods11
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the int value-1");
        int v1 = s.nextInt();
        System.out.println("Enter the int value-2");
        int v2 = s.nextInt();
        if(v1>0 && v2>0)
        {
           System.out.println("***choice***");
           System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.moddiv");
           System.out.println("Enter the choice");
           int choice = s.nextInt();
           switch(choice)
           {
            case 1:
              Addition ad = new Addition();
              int r1 = ad.add(v1,v2);
              System.out.println("sum:"+r1);
              break;
            case 2:
              Subtraction sb = new Subtraction();
              int r2 = sb.sub(v1,v2);
              System.out.println("sub:"+r2);
              break;
            case 3:
              Multiplication ml = new Multiplication();
              int r3 = ml.mul(v1,v2);
              System.out.println("mul:"+r3);
            case 4:
              Division dv = new Division();
              float r4 = dv.div(v1,v2);
              System.out.println("div:"+r4);
            case 5:
              ModDivision md = new ModDivision();
              int r5 = md.moddiv(v1,v2);
              System.out.println("moddiv:"+r5);
            default :
              System.out.println("Invalid choice");
           
           }
        }
    }
}