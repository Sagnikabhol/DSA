class Range
{
    public static void main(String[]args)
    {
        int []arr={23,9,76,5,66,34};
        int target=5;
        System.out.println(Rangeelement(arr,target,1,4));
    }
    static int Rangeelement(int[]arr,int target,int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=start;i<=end;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    
}