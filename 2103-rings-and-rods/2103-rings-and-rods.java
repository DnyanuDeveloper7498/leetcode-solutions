class Solution {
    public int countPoints(String rings) {
        
      int freq[]=new int[30];

      for(int i=0;i<rings.length();i+=2)
      {
        int color=rings.charAt(i);
        int rod=rings.charAt(i+1)-'0';
        int colorIndex=0;
     
        if(color=='R')
         colorIndex=0;
         else if(color=='G')
         colorIndex=1;
         else if(color=='B')
         colorIndex=2;

        int index=3*rod+colorIndex;

        freq[index]++;

      }
      
      int ct=0;

      for(int i=0;i<10;i++)
      {
        int start=3*i;

        if(freq[start]>0 &&
           freq[start+1]>0&&
           freq[start+2]>0)
           ct++;
      }
     return ct;
    }
}