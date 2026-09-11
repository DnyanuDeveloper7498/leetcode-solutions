class Solution {

    static 
    {

          Solution sol =new Solution();

          for(int i=0;i<500;i++)
          {
             sol.smallerNumbersThanCurrent(new int []{0});
          }
    }


    public int[] smallerNumbersThanCurrent(int[] nums)
    
     {

        int freq[]=new int[max(nums)+1];
       
        int ans[]=new int [nums.length];


        for(int num:nums)
        {
            freq[num]++;
        }


        for(int i=1;i<freq.length;i++)
        {
            freq[i]=freq[i]+freq[i-1];
        }

         for(int i=0;i<nums.length;i++)
         {
             if(nums[i]==0)
             {
                ans[i]=0;
             }
             else
             {
                ans[i]=freq[nums[i]-1];
             }
         }


        return ans;
        
    }


      public static int max(int arr[])
    {
        int max=Integer.MIN_VALUE;

        for(int num:arr)
        {
            if(num>max)
            {
                max=num;
            }
        }
        return max;
    }

}