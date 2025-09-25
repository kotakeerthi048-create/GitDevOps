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
class ModDivison
{
    int modDiv(int x,int y)
    {
        return x%y;
    }
}
class DemoMethod12
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value-1:");
        int v1 = s.nextInt();
        System.out.println("Enter the value-2:");
        int v2 = s.nextInt();
        if(v1>0 && v2>0)
        {
            System.out.println("***choice***");
            System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.modDiv:");
            System.out.println("Enter the choice:");
            int choice = s.nextInt();
            switch(choice)
            {
            case 1:
              Addition ad = new Addition();
              int r1 = ad.add(v1,v2);
              System.out.println("Sum:"+r1);
            case 2:
              Subtraction sb = new Subtraction();
              int r2 = sb.sub(v1,v2);
              System.out.println("sub:"+sb);
            case 3:
              Multiplication ml = new Multiplication();
              int r3 = ml.mul(v1,v2);
              System.out.println("mul:"+ml);
            case 4: 
              Division dv = new Division();
              float r4 =  dv.div(v1,v2);
              System.out.println("Div:"+r4);
              break;
            case 5: 
              ModDivision md  = new ModDivision();
              int r5 = md.modDiv(v1,v2);
              System.out.println("modDiv:"+r5);
            default:
                System.out.println("Invalid Choice...");
            }
        }
        else
        {
            System.out.println("Invalid Values...");
        }
    }
}