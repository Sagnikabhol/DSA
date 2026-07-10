import java.util.Scanner;
class Program {
    public static void main (String[]args)
    {
      Scanner sc = new Scanner (System.in);
      int [] arr = new int[5];
      System.out.println("Enter the student Number");
      int total = 0;
      for(int i = 0;i<=arr.length-1;i++)
      {
      arr [i] = sc.nextInt();
      total+=arr[i];
      }
      
         double per=(total*100)/500;
      
       System.out.println("The percentage of this student is: "+ per);
    }
}