class missingelement
{
    public static void main(String[]args)
    {
        int[]arr={23,90,388,36,98,11,4,86};
        target=98;
        int ans=linearsearch(arr,target);
        System.out.println(ans);
    }
    static int linearsearch(int[]arr,int)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int element=arr[i];
            if(element==target)
            {
                return i;
            }
        }
        return -1;
    }
}