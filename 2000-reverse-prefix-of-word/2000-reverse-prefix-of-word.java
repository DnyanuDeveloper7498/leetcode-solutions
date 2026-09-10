class Solution {
    public String reversePrefix(String word, char ch) {
        
           char arr[]=word.toCharArray();

          int end=0;

          for(int i=0;i<arr.length;i++)
          {
             if(arr[i]==ch)
             {
               end=i;
               break;
             }
          }


         int start=0;

         while(start<end)
         {
            char temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;

               start++;
               end--;
         }
         


          return new String(arr);
          
      
    }
}