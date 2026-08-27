public class matrix2D 
{
    public static void main(String[]args)
    {
          int [] [] nums = {{10,20,30,40},
                             {11,25,35,45},
                             {28,29,37,49},
                             {33,34,38,50}};
          int target = 37;
         int[] ans = search(nums, target);
         System.out.println("Row = " + ans[0] + ", Col = " + ans[1]);
    }
    public static int[] search(int [][]nums,int target)
    {
        for(int row = 0;row<=nums.length-1;row++)
        {
             for(int col = 0;col<nums[row].length;col++)
             { 
                if(nums[row][col]==target)
                {
                    return new int[] {row,col};
                }
             }
        }
      return  new int[] {-1,-1};
      
    }

}