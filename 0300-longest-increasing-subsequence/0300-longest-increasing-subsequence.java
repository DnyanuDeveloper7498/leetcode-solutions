class Solution {
    public int lengthOfLIS(int[] nums) 
    {

        int ans[]=new int [nums.length];
        int len=0;

        for(int num:nums)
        {
            int start=0;
            int end=len;

            while(start<end)
            {
                int mid=(start+end)>>>1;

                if(ans[mid]<num)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid;
                }
            }

            ans[start]=num;
            if(start==len)
            {
                len++;
            }

        }

        return len;
        
    }
}