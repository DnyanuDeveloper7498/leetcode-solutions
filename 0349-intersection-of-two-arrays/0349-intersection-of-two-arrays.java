class Solution {


   static 
   {
       Solution sol=new Solution();

       for(int i=0;i<500;i++)
       {
          sol.intersection(new int []{0},new int []{0});
       }
   }


    public int[] intersection(int[] nums1, int[] nums2) {
        
   int freq1[]=new int [max(nums1)+1];

    int freq2[]=new int [max(nums2)+1];

    for(int num:nums1)
    {
      freq1[num]++;
    }

    for(int num:nums2)
    {
      freq2[num]++;
    }



    int ct = 0;

    for(int i = 0; i < Math.min(freq1.length, freq2.length); i++)
    {
      if(freq1[i] > 0 && freq2[i] > 0)
      {
        ct++;
      }
    }


    int ans[]=new int [ct];
    int j=0;

    for(int i=0;i<Math.min(freq1.length,freq2.length);i++)
    {
      if(freq1[i] > 0 && freq2[i] > 0)
      {
        ans[j]=i;
        j++;
      }
    }
   return ans;
  }

  public static int max(int nums[])
  {
    int max=Integer.MIN_VALUE;

    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]>max)
      {
        max=nums[i];
      }
    }
    return max;
  }
    
}