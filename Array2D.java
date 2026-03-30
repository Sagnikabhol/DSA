import java.util.Arrays;
class Array2D
{
    public static void main(String[]args)
    {
        int[][]arr={{67,98,9786,66,12},
        {65,998,8,9},
        {7,57,887,9,1}};
        int target=57;
        int[] ans=Array(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Array(int[][]arr,int target)
    {
      for(int row=0;row<arr.length;row++)
      {
        for(int col=1;col<arr.length;col++)
        {
        if(arr[row][col]==target)
        {
            return  new int[]{row,col};
        }
      }
   }
       return  new int[]{-1,-1};
    }
}