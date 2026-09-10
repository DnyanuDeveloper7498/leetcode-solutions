class Solution {
    public String mergeAlternately(String word1, String word2) {

          char ans[]=new char[(word1.length()+word2.length())];

          int s1Ind=0;
          int s2Ind=0;

          int s1Len=word1.length();
           int s2Len=word2.length();

          int index=0;

       while(s1Ind< s1Len || s2Ind<s2Len)
         {
            if(s1Ind<s1Len)
            {
               ans[index++]=word1.charAt(s1Ind++);
            }
             if(s2Ind<s2Len)
            {
               ans[index++]=word2.charAt(s2Ind++);
            }
         }

         return new String(ans);    
      }
        
    
}