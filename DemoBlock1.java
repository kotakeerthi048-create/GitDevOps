class DemoBlock1
{
    static int a;
    static
    {
       System.out.println("***Static-block***");
       System.out.println("The value a:"+a);
    }
    public static void main(String[]args)
    {
        a = 135;
        System.out.println("***main()***");
        System.out.println("The value a:"+a);
    }
}