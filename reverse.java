import java.util.Scanner;
public class reverse
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the String");
       String s=sc.next();
       System.out.println(rev(s));
    }
    public static StringBuffer rev(String s)
    {
        StringBuffer sb = new StringBuffer(s);
       StringBuffer rev=sb.reverse();
        return rev;
    }
}