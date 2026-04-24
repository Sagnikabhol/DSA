class Richest1672
{
    public static void main(String[]args)
    {
        int[][]arr={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][]arr)
    {
      int max=0;
        for(int person=0;i<arr.length;person++)
        {
            int sum=0;
            for(int account=0;account<arr[account].length;account++)
            {
                sum+=arr[person][account];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }

}