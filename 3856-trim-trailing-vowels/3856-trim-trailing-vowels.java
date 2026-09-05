class Solution {


    static 
    {
        Solution sol =new Solution();

        for(int i=0;i<500;i++)
        {
            sol.trimTrailingVowels("hellow");
        }
    }



    public String trimTrailingVowels(String s) {

         for(int i=s.length()-1;i>=0;i--)
           {
               char ch=s.charAt(i);

               if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
               {
                    s=s.substring(0,i+1);
                   return s;
               }
          
           }

         return "";
        
    }
}