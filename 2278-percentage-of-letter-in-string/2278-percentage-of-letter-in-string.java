class Solution {
    public int percentageLetter(String s, char letter) {
        
   
                 int[] freq = new int[26];
                    for (int i=0;i<s.length();i++) 
                    {
                        freq[s.charAt(i)-'a']++;
                    }
               

               for(int i=0;i<26;i++)
               {
                  if(freq[i]!=0)
                  {


                     if(((char)(i+'a'))==letter)
                     {
                       
                        return (freq[i]*100)/s.length();
                     }
                  }
               }
 
           return 0;  
         

    }
}