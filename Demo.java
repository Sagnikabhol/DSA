import java.util.Scanner;
public class Demo
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter num1");
      int x=sc.nextInt();
     while(x!=0)
     {
        if(num%2==0)   
       System.out.println("even");
       else{
       System.out.println("odd");
       }
     }
    }
}