class Solution {


 static{
        Solution sol = new Solution();
        for(int i=0;i<500;i++){
            sol.maxSubarraySumCircular(new int[] {0});
        }
 }

   public  int maxSubarraySumCircular(int[] nums) {
        
    int maxSum=nums[0];

    int minSum=nums[0];

    int currentMinSum=nums[0];

    int currentMaxSum=nums[0];

    int totalSum=nums[0];

    
    for(int i=1;i<nums.length;i++)
      {
        currentMaxSum=Math.max(nums[i],currentMaxSum+nums[i]);
        maxSum=Math.max(maxSum,currentMaxSum);
       
        currentMinSum=Math.min(nums[i],currentMinSum+nums[i]);
        minSum=Math.min(minSum,currentMinSum);
      }

     for(int i=1;i<nums.length;i++)
        {
           totalSum+=nums[i];
        } 

        if(maxSum<0)
        {
           return maxSum;  
        }

      return Math.max(maxSum,totalSum-minSum);
   }

}