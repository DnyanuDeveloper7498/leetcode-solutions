class Solution {
    public boolean detectCapitalUse(String word) {
        
          int capital=0;
          int len=word.length();

          for(int i=0;i<len;i++)
          {
            if(word.charAt(i)>='A' &&
               word.charAt(i)<='Z')
               {
                capital++;
               }
          }

        while(capital==0)
        {
            return true;
        }

        while(capital==len)
        {
            return true;
        }

        while(capital==1&&word.charAt(0)>='A'&&
              word.charAt(0)<='Z')
              {
                return true;
              }
    return false;
    }
}