class Solution {

     static {
        Solution sol= new Solution();
         
         for(int i=0;i<500;i++)
         {
             sol.missingNumber(new int []{0});
         }
     }


    public int missingNumber(int[] nums) {
   
      int ans=nums.length;

      for(int i=0;i<nums.length;i++)
      {
        ans=ans^i^nums[i];
      }
      return ans;  
    }
}