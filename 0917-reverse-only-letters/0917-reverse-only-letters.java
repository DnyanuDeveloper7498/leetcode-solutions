class Solution {
    public String reverseOnlyLetters(String s) {
        
       char[] ch = s.toCharArray();

         int left=0;
         int right=ch.length-1;

         while(left<right)
         {
             
             while(left<right && !((ch[left]>='A' && ch[left]<='Z')||
                                   (ch[left]>='a' && ch[left]<='z')))
                                   {
                                    left++;
                                   }

               while(left<right && !((ch[right]>='A' && ch[right]<='Z')||
                                   (ch[right]>='a' && ch[right]<='z')))
                                   {
                                    right--;
                                   }

 


             char temp=ch[left];
                  ch[left]=ch[right];
                  ch[right]=temp;
               left++;
               right--;
         }
        
         return new String(ch);
    }
}