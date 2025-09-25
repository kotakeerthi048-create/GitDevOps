import java.util.scanner;
class Student
{
  String rollNo,name,branch;
  void getStudent()
  {
    System.out.println("***student details***");
    System.out.println("RollNo:"+rollno);
    System.out.println("Name:"+name);
    System.out.println("Branch:"+branch);
  }
}
class DemoCon5
{
  public static void main(String[]args)
  {
    Scanner s = new Scanner(System.in);
    Student ob = new Student();
    System.out.println("Enter the rollNo:");
    ob.rollno = s.nextLine();
    System.out.println("Enter the name:");
    ob.name = s.nextLine();
    System.out.println("Enter the branch:");
    ob.branch = s.nextLine();
    ob.getStudent();
  }
} 