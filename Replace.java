import java.util.Scanner;
class Replace
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        System.out.println("which you want to do");
        char s1=sc.next().charAt(0);
         int count=0;
         for(int i=0;i<s.length();i++)
         {
            char c=s.charAt(i);
            if(c == s1)
            {
                count++;
                System.out.print(count);
            }

            else{
            System.out.print(c);
            }
        
       }
       if(count==0)
       {
           System.out.println("\nCharacter not found in the string");
       }
     }
  }