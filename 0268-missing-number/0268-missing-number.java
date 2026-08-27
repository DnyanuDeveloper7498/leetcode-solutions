class Solution {
    public int missingNumber(int[] nums) {

      int freq[]=new int [max(nums)+2];

      for(int num:nums)
      {
          freq[num]++;
      }    

      for(int i=0;i<freq.length;i++)
      {
        if(freq[i]==0)
        {
            return i;
        }
      }
    return -1;

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