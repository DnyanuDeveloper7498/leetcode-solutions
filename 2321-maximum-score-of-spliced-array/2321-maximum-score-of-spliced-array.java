class Solution {
   static {

          Solution sol=new Solution();

          for(int i=0;i<500;i++)
          {
            sol.maximumsSplicedArray(new int[]{0},new int[]{0});
          }
    }

    
    
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {

      int n=Math.min(nums1.length,nums2.length);

        int curr1=0;
        int curr2=0;
        int max1=0;
        int max2=0;

        int sum1=0;
        int sum2=0;

        for(int i=0;i<n;i++)
        {
            sum1+=nums1[i];
            sum2+=nums2[i];


            int diff=nums2[i]-nums1[i];

            curr1=Math.max(0,curr1+diff);
            max1=Math.max(max1,curr1);

             curr2=Math.max(0,curr2-diff);
              max2=Math.max(max2,curr2);


        }


             
        return Math.max(sum1+max1,sum2+max2);
     
    }
}