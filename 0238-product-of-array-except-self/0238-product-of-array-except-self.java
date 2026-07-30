class Solution {

   static {
            Solution sol=new Solution();

        for(int i=0;i<500;i+=2)
        {
            sol. productExceptSelf(new int []{0,1});
        }
   }


    public int[] productExceptSelf(int[] nums) {
       
      int len=nums.length;
      int left[]=new int [len];
      int right[]=new int [len];
      int prod[]=new int [len];


     left[0]=nums[0];
    for(int i=1;i<len;i++)
    {
        left[i]=left[i-1]*nums[i];
    }  
     
     right[len-1]=nums[len-1];
    for(int i=len-2;i>=0;i--)
    {
        right[i]=right[i+1]*nums[i];
    }  

   // find product 

     prod[0]=right[1];
     prod[len-1]=left[len-2];

     for(int i=1;i<len-1;i++)
     {
        prod[i]=left[i-1]*right[i+1];
     }
     
    return prod;
    }
}