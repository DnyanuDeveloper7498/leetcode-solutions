class Solution {
  
    static {

        Solution sol=new Solution();
        for(int i=0;i<500;i++)
        {
            sol.firstUniqChar("helow");
        }
    }


    public int firstUniqChar(String s) {

        int freqCt[]=new int [26];

        for(int i=0;i<s.length();i++)
            freqCt[s.charAt(i)-'a']++;
         

        for(int i=0;i<s.length();i++)
        {
            if(freqCt[s.charAt(i)-'a']==1)
            return i;
        }    
        return -1;
    }
}