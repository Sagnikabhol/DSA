class SearchInString
{
    public static void main(String[]args)
    {
        String s="Sagnika";
        char c='i';
        System.out.println(Search(s,c));
    }
     static boolean Search2(String s,char c)
     {
        if(s.length()==0)
        {
            return false;
        }
       for(char ch:s.toCharArray())
       {
        return true;
       }
        return false;
     }
    static boolean Search(String s,char c)
    {
        if(s.length()==0)
        {
            return false;
        }
       for(int i=0;i<s.length();i++)
       {
         if(c==s.charAt(i))
         {
            return true;
         }
       }
       return false;
    }
}