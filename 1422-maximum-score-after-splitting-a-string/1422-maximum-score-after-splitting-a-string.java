class Solution {
    public int maxScore(String s) {
        
        char ch[]=s.toCharArray();

        int ctZero=0;
        int ctOne=0;

        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='1')
            {
                ctOne++;
            }
        }

       int maxScore=0;

       for(int i=0;i<ch.length-1;i++)
       {
          if(ch[i]=='0')
          {
            ctZero++;
          }
          else
          {
            ctOne--;
          }

          int score= ctZero+ctOne;
          maxScore=Math.max(maxScore,score);
       }
 return maxScore;
    }
}