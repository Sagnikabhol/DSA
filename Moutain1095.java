public class Moutain1095 {
    public static void main(String[]args)
    {
        int []num={1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(check(num,target));
    }
    public static int check(int[]num,int target)
    {
        int start = 0;
        int end = num.length-1;
       while(start<=end)
       {
          int mid = start+(end-start)/2;
          if(num[mid]>num[mid+1])
          {
            end= mid;
          }
          start=mid+1;
       } 
         return start; 
   }
}
