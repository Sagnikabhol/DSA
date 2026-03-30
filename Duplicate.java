import java.util.Scanner;
class Duplicate
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input");
        String s=sc.next();
         String res="";
        for(int i=0;i<s.length()-1;i++)
        {
           
             char ch=s.charAt(i);
             if(res.indexOf(ch)==-1)// res is empty and if not present then enter 
             {
                res+=ch;
             }
        }
        System.out.println(res);
    }
}