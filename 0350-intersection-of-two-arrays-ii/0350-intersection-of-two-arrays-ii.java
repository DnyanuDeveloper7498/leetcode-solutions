class Solution {
 
    static {
        Solution sol=new Solution();

        for(int i=0;i<500;i++)
        {
            sol.intersect(new int []{0},new int []{0});
        }
    }

   
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int freq1[]=new int[max(nums1)+1];

        int freq2[]=new int[max(nums2)+1];

        for(int num:nums1)
        {
            freq1[num]++;
        }

         for(int num:nums2)
        {
            freq2[num]++;
        }


     int arrSize=0;

       for(int i=0;i<Math.min(freq1.length,freq2.length);i++)
       {
           if(freq1[i]>0 &&freq2[i]>0)
           {
            arrSize+=Math.min(freq1[i],freq2[i]);
           }
       }

        int ans[]=new int [arrSize];
        int index=0;

          for(int i=0;i<Math.min(freq1.length,freq2.length);i++)
       {
           if(freq1[i]>0 &&freq2[i]>0)
           {
              int ct=Math.min(freq1[i],freq2[i]);

              for(int k=0;k<ct;k++)
              {
                 ans[index]=i;
                 index++;
              }
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
         max=num;
    }
   return max;
  }


}