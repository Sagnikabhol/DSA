class FirstPosition
{
    public static void main(String[]args)
    {
        int[]num={2,3,5,6,8,10,11,12,15,20,23,30,31,35,39,40,};
        int target=35;
        System.out.println(Searchposition(num,target));
    }
    static int Searchposition(int[]num,int target)
    {
        int start=0;
        int end=1;
        while(target>num[end])
        {
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<num[mid])
            {
               end=mid-1;
            }
            else if(target>num[mid])
            {
                start=mid+1;
            }
            else
               return mid;
        }
        return -1;
    }
}