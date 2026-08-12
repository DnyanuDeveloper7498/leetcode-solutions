class Solution {

      static 
      {
        
        Solution sol=new Solution();
        
         for(int i=0;i<500;i++)
         {
            sol.replaceElements(new int []{0});
         }
      }

    public int[] replaceElements(int[] arr)
     {
       
       int max=-1;

       for(int i=arr.length-1;i>=0;i--)
       {
          int curr=arr[i];
         
          arr[i]=max;

          if(curr>max)
          {
            max=curr;
          }
       }   

       return arr;
     }
}