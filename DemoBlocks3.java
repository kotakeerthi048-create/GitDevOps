class BTest2
{
    int x;
    static int y;
    {
        x++;
        y++;
        System.out.println("***SubClass Instance-Block***");
        System.out.println("The value x:"+x);
        System.out.println("The value y:"+y); 
    }
}
class DemoBlocks3
{
    public static void main(String[]args)
    {
        System.out.println("***Object-1***");
        BTest2 ob1 = new BTest2();
        System.out.println("***Object-2***");
        BTest2 ob2 = new BTest2();
    }
}