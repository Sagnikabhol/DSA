public class Binary {
    public static void main(String[]args){
        int[]num={1,2,9,16,26,50};
        int target=26;
        int result=Binarysearch(num,target);
        if(result!=-1){
        System.out.println("the result is :" +result);
        }
        else
        System.out.println("number not found");
    }
    public static int Binarysearch(int[]num ,int target)
    {
       int left=0;
       int right=num.length-1;
       while(left<=right)
     {
        int mid=(left+right)/2;
        if(num[mid]==target)
        {
            return mid;
        }
        else if(num[mid]<target)
        { 
            left=mid+1;
        }
            else{
        right=mid-1;
         }
      } 
      return -1;  
    }
}