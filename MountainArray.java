public class MountainArray {
    public static void main(String[] args)
    {
       int [] arr = {1,5,7,10,50,31,30,19};
       System.out.println(check(arr));
    }
    static  int check(int[]arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
           if(arr[mid]>arr[mid+1])
           {
             end = mid;
           }
           else 
              start= mid+1;
        }
        return start;
    }
}
