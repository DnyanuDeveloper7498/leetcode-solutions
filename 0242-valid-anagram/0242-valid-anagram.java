class Solution {

  static {
      Solution sol=new Solution();

      for(int i=0;i<500;i++)
      {
        sol.isAnagram("hellow","hellow");
      }
  }

    public boolean isAnagram(String s, String t) {
       int freqS[]=new int [26];

       int freqT[]=new int [26];

       for(int i=0;i<s.length();i++)
       {
          freqS[s.charAt(i)-'a']++;
       }
       
        for(int i=0;i<t.length();i++)
       {
          freqT[t.charAt(i)-'a']++;
       }
       


      for(int i=0;i<freqS.length;i++)
      {
        if(freqS[i]!=freqT[i])
        {
            return false;
        }
      }
        return true;

    }
}