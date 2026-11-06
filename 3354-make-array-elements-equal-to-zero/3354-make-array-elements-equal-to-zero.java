class Solution {
    public int countValidSelections(int[] nums) {
        
        int totalSum=0;
        int ans=0;
        int prefixSum=0;

        for(int num:nums)
        {
            totalSum+=num;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                 int left=prefixSum;
                 int right=totalSum-prefixSum;

                 if(left==right)
                 {
                    ans+=2;
                 }
                 else if(Math.abs(left-right)==1)
                 {
                    ans+=1;
                 }
            }

          prefixSum+=nums[i];
        }

        return ans;
    }
}