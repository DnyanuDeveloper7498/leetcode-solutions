class Solution {
    public int[] runningSum(int[] nums) {
        
       int left[]=new int[nums.length];

       left[0]=nums[0];

       for(int i=1;i<nums.length;i++)
       {
        left[i]=left[i-1]+nums[i];
       }

       return left;
    }

}