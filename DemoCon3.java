import java.util.scanner;
class Customer
{
    String cId,cName,mId;
    long phNo;
    Customer(String cId,String cName,String mId,long phNo)
    {
        this.cId = cId;
        this.cName = cName;
        this.mId = mId;
        this.phNo = phNo;
    }
    void getCustomer()
    {
        System.out.println("***Customer Details***");
        System.out.println("CustId:"+cId);
        System.out.println("CustName:"+cName);
        System.out.println("MailId:"+mId);
        System.out.println("PhoneNo:"+phNo);
    }
}
class DemoCon3
{
    public static void main(String[]args)
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the CustId:");
    String id = s.nextLine();
    System.out.println("Enter the CustName:");
    String name = s.nextLine();
    System.out.println("Enter the MailId:");
    String mid = s.nextLine();
    System.out.println("Enter the PhoneNo:");
    Long PhNo = s.nextLong();
    Customer ob = new Customer(id,name,mId,phNo);
    ob.getCustomer();
    }
}