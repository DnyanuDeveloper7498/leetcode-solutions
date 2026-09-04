class Solution {

    public boolean isPalindrome(String s) {

        char ch[]=s.toCharArray();

        int left=0;
        int right=ch.length-1;

        while(left<right)
        {

            while(left<right && !((ch[left]>='a' && ch[left]<='z')||
                                  (ch[left]>='A' && ch[left]<='Z')||
                                  (ch[left]>='0' && ch[left]<='9')))
                                  {
                                    left++;
                                  }

             while(left<right && !((ch[right]>='a' && ch[right]<='z')||
                                  (ch[right]>='A' && ch[right]<='Z')||
                                  (ch[right]>='0' && ch[right]<='9')))
                                  {
                                    right--;
                                  }

            char leftChar=ch[left];
            char rightChar=ch[right];

            if(leftChar>='A' && leftChar<='Z')
            {
                leftChar=(char)(leftChar+32);
            }

             if(rightChar>='A' && rightChar<='Z')
            {
                rightChar=(char)(rightChar+32);
            }

        
           if(leftChar!=rightChar)
            {
                return false;
            }

            left++;
            right--;

        }
      return true;
 
    }
}




