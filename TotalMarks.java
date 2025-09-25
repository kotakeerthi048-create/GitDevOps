import java.util.*;
class TotalMarks
{
    public static void main(String[]args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks in sub-1:");
        int sub1 = s.nextInt();
        System.out.println("Enter the marks in sub-2:");
        int sub2 = s.nextInt();
        System.out.println("Enter the marks in sub-3:");
        int sub3 = s.nextInt();
        System.out.println("Enter the marks in sub-4:");
        int sub4 = s.nextInt();
        System.out.println("Enter the marks in sub-5:");
        int sub5 = s.nextInt();
        System.out.println("Enter the marks in sub-6:");
        int sub6 = s.nextInt();
        int totMarks = sub1+sub2+sub3+sub4+sub5+sub6;
        float per = (float)totMarks/6;
        System.out.println("===TotalResult===");
        System.out.println("totMarks:"+totMarks);
        System.out.println("percentage:"+per);
    }
}