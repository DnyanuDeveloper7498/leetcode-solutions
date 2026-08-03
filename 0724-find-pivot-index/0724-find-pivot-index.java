class Solution {
    public int pivotIndex(int[] nums) {
     
     int totalSum=0;

     for(int i=0;i<nums.length;i++)
     {
        totalSum+=nums[i];
     }

     int left=0;

     for(int i=0;i<nums.length; left+=nums[i++])
     {
        if((left*2)==totalSum-nums[i])
        {
            return i;
        }
     }
      return -1;
    }
}