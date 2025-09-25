import java.util.scanner;
class BookDetails
{
   String code,name,author;
   float price;
   BookDetails(String code,String name,String author,float price)
   {
     this.code=code;
     this.name=name;
     this.author=author;
     this.price=price;
   }
   void getBookDetails()
   {
     System.out.println("***BookDetails***");
     System.out.println("Bookcade:"+code);
     System.out.println("Bookname:"+name);
     System.out.println("Bookauthor:"+author);
     System.out.println("Bookprice"+price);
   }
}
class DemoCon4
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Bookcode:");
        String bc = s.nextLine();
        System.out.println("Enter the Bookname:");
        String bn = s.nextLine();
        System.out.println("Enter the Bookauthor:");
        String ba = s.nextLine();
        System.out.println("Enter the Bookprice:");
        float bp = s.nextFloat();
        BookDetails ob = new BookDetails(bc,bn,ba,bp);
        ob.getBookDetails();
    }
}