class Solution {
    
    static 
    { 
        Solution sol=new Solution();

       for(int i=0;i<500;i++)
       {
         sol.findMaxAverage(new int []{0},1);
       }

    }
    
    public double findMaxAverage(int[] nums, int k) 
    {
        int maxSum=0;
        int subSum=0;

        for(int i=0;i<k;i++)
        {
            subSum+=nums[i];
        }

        maxSum=subSum;

     for(int i=k;i<nums.length;i++)
     {
        subSum+=nums[i];
        subSum-=nums[i-k];
        maxSum=Math.max(maxSum,subSum);
     }

      return (double)maxSum/k;
    }
}