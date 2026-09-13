class Solution {
  

   static 
   {
        Solution sol=new Solution();

        for(int i=0;i<500;i++)
        {
            sol.minSubArrayLen(0,new int[]{0});
        }
   }


    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            while (sum >= target) {

                int len = i - left + 1;

                if (len < min) {
                    min = len;

                    
                    if (min == 1) {
                        return 1;
                    }
                }

                sum -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
