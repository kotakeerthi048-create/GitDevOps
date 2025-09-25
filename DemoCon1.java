class CTest1
{
    int a = 10;
    static CTest1()
    {
        System.out.println("***Constructor-CTest1()****");
        System.out.println("The value a:"+a);
    }
    void dis()
    {
        System.out.println("****Incatance-dis()****");
        System.out.println("The  value a:"+a);
    }
}
class DemoCon1
{
    public static void main(String[]args)
    {
        CTest1 ob  = new CTest();
        ob.dis();
    }
}
