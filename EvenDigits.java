class EvenDigits {
    public static void main(String[]args)
    {
         int[] num = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(num));
    }
    static int findNumbers(int[] nums) {
         int count=0;
         for(int n:nums)
         {
            if(even(n))
            {
                count++;
            }
         }
          return count;
    }
        static boolean even(int n)
        {
            int digit=numberofdigit(n);
            return digit%2==0;
        }
        static int numberofdigit(int n)
        {
            int count=0;
            while(n>0)
            {
                n=n/10;
                count++;
            }   
           return count; 
        }
}