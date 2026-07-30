class Solution {
    static {
        Solution sol= new Solution();

        for(int i=0;i<500;i+=2)
        {
            sol.findMaxConsecutiveOnes(new int[]{0});
        }

    }


    public int findMaxConsecutiveOnes(int[] nums) {

        int ct=0;
        int max=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                ct++;
            }
            else
            {
                ct=0;
            }

            max=Math.max(max,ct);
        }

         return max; 
    }
}