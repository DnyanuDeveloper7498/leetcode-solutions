class Solution {
    public int[] leftRightDifference(int[] nums) {

      int totalSum=0;

      int ans[]=new int [nums.length];
     
     for(int i=0;i<nums.length;i++)
     {
        totalSum+=nums[i];
     }


  
     int leftSum=0;

     for(int i=0;i<nums.length;i++)
     {
         leftSum+=nums[i];
        int rightSum=totalSum-leftSum+nums[i];

        ans[i]=Math.abs(rightSum-leftSum);
     }

 return ans;        
    }
}