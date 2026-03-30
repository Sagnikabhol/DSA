
    static int min(int[]arr)
    {
        int ans=arr[0];
        for(int i=1;i<=arr.length-1;i++)
        {
            if(arr[i]<ans)
            {
                arr[i]=ans;
               
            }
           
        }
        return ans;