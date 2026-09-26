class Solution {
    public int mostFrequent(int[] nums, int key) 
    {
      int freq[]=new int [1001];

      for(int i=0;i<nums.length-1;i++)
      {
        if(nums[i]==key)
        {
            freq[nums[i+1]]++;
        }
      }

      int max=Integer.MIN_VALUE;

      int ans=0;

      for(int i=0;i<freq.length;i++)
      {
        if(freq[i]>max)
        {
            max=freq[i];
            ans=i;
        }
      }

  return ans;
    }
}