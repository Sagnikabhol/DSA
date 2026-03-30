class Minimum
{
    public static void main(String[]args)
    {
        int[]arr={56,88,9,6,-9,-1,554,-987};
        System.out.println(min(arr));
    }
    static int min(int[]arr)
    {
        int ans=arr[0];
        for(int i=1;i<=arr.length-1;i++)
        {
            if(arr[i]<ans)
            {
              ans=arr[i];
               
            }  
        }
        return ans;
    }
}