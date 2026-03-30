import java.util.Scanner;
 class Space
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String s=sc.nextLine();
        String sp=s.replace("  ","");
        System.out.println(sp);
    }
}