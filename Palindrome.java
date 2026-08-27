public class Palindrome
{
      public static void main(String[]args)
      {
        int num = 121;
        int rev = 0;
        int n = num;
        while(num>0)
        {
            int rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        if (rev == n)
        {
            System.out.println("True");
        }
        else
            System.out.println("False");
      }
}