class Celling
{
    public static void main(String[]args)
    {
        int[]num={2, 3, 5, 9, 14, 16, 18};
        int target=15;
        int ans=(cellingnumber(num,target));
        System.out.println(ans);
    }
    static int cellingnumber(int[]num,int target)
    {
         int start=0;
         int end=num.length-1;
         while(start<=end)
         {
             int mid=start+(end-start)/2;
            
             if(target<num[mid])
             {
                 end=mid-1;
             }
             if(target>num[mid])
             {
                start=mid+1;
             }
             else
             return mid;
         }
         return start;
    }
}