class Solution {

    public boolean isPalindrome(String s) {
      int start=0;
      int end=s.length()-1;

       while(start<end)
       {
           while(start<end && !isLetterOrDigit(s.charAt(start)))
           {
            start++;
           }
        
           while(start<end && !isLetterOrDigit(s.charAt(end)))
           {
            end--;
           }


          if( Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end)))
          return false;

            start++;
            end--;
       }
      
       return true; 
    }

      public static boolean isLetterOrDigit(char s)
    {
          char ch=Character.toLowerCase(s);
       
          if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9'))
          {
            return true;
          }

          return false;
    }
}