class SearchInRange
{
    public static void main(String[]args)
    {
        int []number={77,98,78,9,23,237,8,31,321,98,21,89,3617,23212};
        int target=9;
        System.out.println(Search(number,target,0,6));
    }
    static int Search(int[] number,int target,int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            int element=number[i];
            if(element==target)
            {
                return i;
            }
        }
        return -1;
    }
}