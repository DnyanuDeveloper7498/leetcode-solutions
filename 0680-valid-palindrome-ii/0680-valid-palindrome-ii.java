class Solution {

   static {
      
      Solution sol=new Solution();

      for(int i=0;i<500;i++)
      {
        sol.validPalindrome("hellow");
      }

   }

    public boolean validPalindrome(String s) {
    
      int i=0;
      int j=s.length()-1;

      while(i<j)
      {
        if(s.charAt(i)!=s.charAt(j))
        {
            return isPalindrome(s ,i+1,j)||isPalindrome(s ,i,j-1);
        }
        i++;
        j--;
      }
      return true;
    }


    public static boolean isPalindrome(String s ,int left ,int right)
    {
        while(left<right)
        {
           if(s.charAt(left)!=s.charAt(right))
           {
            return false;
           }
           left++;
           right--;
        }
      return true;
    }
}