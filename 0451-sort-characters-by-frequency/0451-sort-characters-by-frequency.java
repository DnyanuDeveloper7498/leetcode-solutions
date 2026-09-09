class Solution {
    public String frequencySort(String s) {


       int freq[]=new int [128];

       for(char ch:s.toCharArray())
       {
        freq[ch]++;
       } 

      StringBuilder[] flist=new StringBuilder[s.length()+1];

      for(int i=0;i<128;i++)
      {
         if(freq[i]>0)
         {
            int f=freq[i];

            if(flist[f]==null)
            {
                flist[f]=new StringBuilder();
            }
            flist[f].append((char)i);
         }
      }


      StringBuilder ans =new StringBuilder();

      for(int i=s.length();i>0;i--)
      {
         if(flist[i]==null) continue;

        for(char ch:flist[i].toString().toCharArray())
        {
            for(int k=0;k<i;k++)
            {
              ans.append(ch);
            }
        }
      }

      return ans.toString();
        
    }
}