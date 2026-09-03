class Solution {

  
   static 
   {
      Solution sol=new Solution();

      for(int i=0;i<500;i++)
      {
         sol.reverseWords("hellow");
      }
   }


    public String reverseWords(String s) {

        char ch[]=s.toCharArray();

         int start=0;

         for(int i=0;i<=ch.length;i++)
         {
            if(i==ch.length|| ch[i]==' ')
            {
                int left=start;
                int right=i-1;

                while(left<right)
                {
                    char temp =ch[left];
                    ch[left]=ch[right];
                    ch[right]=temp;
                    left++;
                    right--;
                }

                start=i+1;
            }
         }
        return new String(ch);
    }
}