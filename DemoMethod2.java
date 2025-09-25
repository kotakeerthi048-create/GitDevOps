import java.util.Scanner;
class WithDraw
{
    void WDraw(int amt,float bal)
    {
        if(amt<=bal)
        {
            System.out.println("Amt withDraw:"+amt);
            System.out.println("Balance Amt:"+(bal-amt));
            System.out.println("Transaction successfull:");
        }
        else
        {
            System.out.println("Invalid Transaction...");
        }
    }
}
class Deposit
{
    void deposit(int amt,float bal)
    {
        System.out.println("Amt Deposit:"+amt);
        System.out.println("Balance amt:"+bal+amt);
        System.out.println("Transaction Successfull..");
    }
}
class DemoMethod2
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        float bal = 2000.0F;
        System.out.println("***choice***");
        System.out.println("1.WithDraw\n2.Deposit:");
        System.out.println("Enter the choice:");
        int choice = s.nextInt();
        switch(choice)
        {
            case 1:
             System.out.println("Enter the amt:");
             int a1 = s.nextInt();
             if(a1>0 && a1 % 100==0)
             {
                WithDraw wd = new WithDraw();
                wd.WDraw(a1,bal);
             }
             else
             {
                System.out.println("Invalid amt...");
             }
           case 2:
           System.out.println("Enter the amt:");
           int a2 = s.nextInt();
           if(a2>0 && a2 % 100==0);
           {
              Deposit dp = new Deposit();
              dp.deposit(a2,bal);
           }
           break;
           default:
            System.out.println("Invalid Choice...");
        }
    }
}
