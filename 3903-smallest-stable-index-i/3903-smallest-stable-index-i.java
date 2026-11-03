class Solution {
    public int firstStableIndex(int[] nums, int k) {
        

        int n=nums.length;

        int suffixMin =nums[n-1];

        for(int i=n-2;i>=0;i--)
        {
             suffixMin = Math.min(suffixMin, nums[i]);
        }

        int prefixMax=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            prefixMax = Math.max(prefixMax, nums[i]);

            if(prefixMax-suffixMin<=k)
            {
                return i;
            }


            if (nums[i] == suffixMin) {
               
                suffixMin = Integer.MAX_VALUE;

                for (int j = i + 1; j < n; j++) {
                    suffixMin = Math.min(suffixMin, nums[j]);
                }
            }
        }
        return -1;
    }
}