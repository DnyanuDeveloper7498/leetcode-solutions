class Solution {
    public int lengthOfLongestSubstring(String s) {

        int freq[]=new int [128];
        int left=0,maxlength=0;
        
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
          left=Math.max(left,freq[ch]);
           freq[ch]=i+1;
          maxlength=Math.max(maxlength,i-left+1);
        }

     return  maxlength; 
    }
}