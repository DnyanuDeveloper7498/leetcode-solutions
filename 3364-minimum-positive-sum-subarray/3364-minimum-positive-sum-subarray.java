class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       int n=nums.size();

       int prefix[]=new int[n+1];

       for(int i=0;i<n;i++)
       {
        prefix[i+1]=prefix[i]+nums.get(i);
       } 

        int ans=Integer.MAX_VALUE;
       
       for(int i=0;i<n;i++)
       {
         for(int j=l;j<=r;j++)
         {
            if(i+j<=n)
            {
                int sum=prefix[i+j]-prefix[i];

                if(sum>0)
                {
                    ans=Math.min(ans,sum);
                }
            }

         }
       }
    return ans==Integer.MAX_VALUE?-1:ans;
    }
}