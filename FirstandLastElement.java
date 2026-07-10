import java.util.Arrays;
class FirstandLastElement
{
    public static void main(String[]args)
    {
        int[]num={5,7,7,7,7,8,8,10};
        int target=7;
        System.out.println(Arrays.toString(Searchin(num,target)));
    }
     static int[] Searchin(int[]num,int target)
    {
       int[]ans={-1,-1};
       ans[0]=search(num,target,true);
       ans[1]=search(num,target,false);
       return ans;
    }
    static int search(int[]num,int target,boolean Firstcheck)
    {
        int ans=-1;
        int start=0;
        int end=num.length-1;
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
            else{
            ans=mid;
            if(Firstcheck)
            {
                end=mid-1;
            }
            else
            start=mid+1;
        }
    
      }
        return ans;
    }
}