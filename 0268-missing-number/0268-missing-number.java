class Solution {

    public int missingNumber(int[] nums) {
   
      int size= max(nums)+2;
      int freq[]=new int [size];

      for(int num:nums)
      {
        freq[num]++;
      }

      for(int i=0;i<size;i++)
      {
        if(freq[i]==0)
         return i;
      }
return -1;

    }



    public static int max(int arr[])
    {
        int max=Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]>max)
           max=arr[i];
       }
       return max;
    }
}