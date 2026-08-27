public class Armstrong 
{
    public static void main(String[]args)
    {
        int num = 1634;
        int n = num;
        int value = 0;
        while(num>0)
        {
           int rem = num%10;
           value+=Math.pow(rem,4);
           num = num/10;
        }
       if (value==n)
        {
            System.out.println("true");
        } 
        else
            System.out.println("false");
    }
}
