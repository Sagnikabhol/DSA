public class rotatedArray33 {
   public static void main(String[] var0) {
      int[] nums= {4, 5, 6, 7, 0, 1, 2};
       int target = 0;
      System.out.println(search(nums, target));
   }

   // Search in rotated sorted array in O(log n)
   public static int search(int[]nums,int target)
   {
    int start = 0;
    int end=nums.length-1;
    while(start<=end)
    {
        int mid = start+(end-start)/2;
        if(target==nums[mid])
            {
                return mid;
            }
            //left 
        if(nums[start]<=nums[mid]){
        if(target>=nums[start] && target <nums[mid])
        {
            end = mid-1;
        } else {
           start=mid+1;
        }
        //right
        if(target<=nums[end] && target>nums[mid])
        {
        start = mid+1;
        } else
        end= mid-1;
    }
}
     return -1;
   }
}
