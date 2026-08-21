class Solution {
    public boolean areOccurrencesEqual(String s) {
    
      int freq[]=new int [26];

      for(char ch:s.toCharArray())
      {
        freq[ch-'a']++;
      }

      int ct=0;

      for(int fre:freq)
      {
        if(fre!=0)
        {
            if(ct==0)
            {
                ct=fre;
            }
            else if(ct!=fre)
            {
                return false;
            }
        }

      }


        return true;
    }
}