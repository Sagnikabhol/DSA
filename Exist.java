import java.util.Scanner;
class Exist
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the  size of an array");
       int N=sc.nextInt();
       int [] x=new int[N];
       for(int i=0;i<x.length;i++)
       {
          x[i]=sc.nextInt();
       }
       System.out.print("Array elements: ");
       for(int i=0;i<x.length;i++)
       {
        System.out.print(+x[i]+" ");
       }
        System.out.println(" Whats your missing element ");
        System.out.println();
        int c=sc.nextInt();
        int result=search(x, c);
        if(result==-1)
        {
            System.out.println("element not found: ");
        }
        else
        System.out.println("element found: "+result);
    }
    public  static int search(int []x,int c)
     {
         
          for(int i=0;i<x.length;i++)
          {
             if(c==x[i])
             {
                return i;
             }
          }
          return -1;
     }
}