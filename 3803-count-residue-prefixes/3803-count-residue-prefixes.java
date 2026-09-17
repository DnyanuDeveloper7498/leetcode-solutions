class Solution {
    public int residuePrefixes(String s) 
    {

       int count=0;
       int dis=0;
       int freq[]=new int [26];

       for(int i=0;i<s.length();i++)
       {
          int index=s.charAt(i)-'a';

          if(freq[index]==0)
          {
            dis++;
          }
          freq[index]++;

        int length=i+1;
           
            if(dis==length%3 )
            {
                count++;
            }

       }

       return count; 
    }
}