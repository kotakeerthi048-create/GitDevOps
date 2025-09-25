class DemoBlock1
{
    static int a;
    static
    {
       System.out.ptintln("***Static-block***");
       System.out.println("The value a:"+a);
    }
    public static void main(String[]args)
    {
        a = 120;
        System.out.println("***main()***");
        System.out.println("The value a:"+a);
    }
}