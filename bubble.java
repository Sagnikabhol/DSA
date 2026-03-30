public class bubble
{
    public static void main(String[]args)
    {
        int[]num={230,78,1,67,2,6};
        int size=num.length;
        for(int i=0;i<size;i++)
        {
            int temp=0;
            for(int j=0;j<size-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println("after changing");
        for(int nums : num)
        {
          System.out.print(nums+" ");
        }
    }
}