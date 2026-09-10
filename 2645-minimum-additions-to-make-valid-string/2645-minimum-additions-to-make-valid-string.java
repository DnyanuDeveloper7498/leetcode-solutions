class Solution {
    public int addMinimum(String word) {

        int ans=0;
        int i=0;
        int len=word.length();


        while(i<len)
        {
            int exp=0;

            while(exp<3)
            {
               if(i<len && word.charAt(i)-'a'==exp)
               {
                i++;
               }
               else 
               {
                  ans++;
               }
              exp++;
            }
        }
        
        return ans;
    }
}