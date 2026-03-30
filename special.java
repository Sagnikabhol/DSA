import java.util.Scanner;
class special
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter what you want");
            String s=sc.next();
            // for(int i=0;i<s.length();i++)
            // {
            //     char ch=s.charAt(i);
            //     if(ch>='a' && ch<='z')
            //     {
            //        System.out.print(ch);
            //     }
               
            // }
            String plain=s.replaceAll("[^a-zA-Z0-9]","");
            System.out.println(plain);
     }
    }