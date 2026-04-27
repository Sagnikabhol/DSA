class BinarySearch
{
    public static void main(String[]args)
    {
       // int []num ={4,8,9,14,18,20,30,45,54,60,78,90};
        int[]num={322,98,89,79,56,45};
        int target=89;
        int ans=(BinarySearching(num,target));
         System.out.println(ans);
       
    }
    static int BinarySearching(int []num,int target)
    {
        int start=0;
        int end=num.length-1;
        boolean isAD=num[start]<num[end];
        while(start<=end){
        int mid = start + (end - start) / 2;
        if(num[mid]==target)
        {
            return mid;
        }
       if(isAD)
       {
        if(target>num[mid])
       {
        start=mid+1;
       }
       else if(target<num[mid])
       {
              end=mid-1;
       }
       }
       else
       if(target<num[mid])
       {
        start=mid+1;
       }
       else if(target>num[mid])
       {
              end=mid-1;
       }
        }
          return -1;
    }
}