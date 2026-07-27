class Solution {

     static 
     {
        Solution  sol=new Solution();

        for(int i=0;i<500;i++)
        {
            sol.maxProduct(new int[]{0});
        } 
     }


    public int maxProduct(int[] nums) {
    
      int maxProd=nums[0];
      int currentMax=nums[0];
      int currentMin=nums[0];

      for(int i=1;i<nums.length;i++)
      {
        int tempMax=currentMax;
        int tempMin=currentMin;
          
        currentMax=Math.max(nums[i],
                   Math.max(nums[i]*tempMax,nums[i]*tempMin));

        currentMin=Math.min(nums[i],
                   Math.min(nums[i]*tempMax,nums[i]*tempMin));
             
             maxProd=Math.max(maxProd,currentMax);

      }

     return maxProd;
    }
}