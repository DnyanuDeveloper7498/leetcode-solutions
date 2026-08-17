class Solution {
    public int numIdenticalPairs(int[] nums)
     {
        int max=Integer.MIN_VALUE;

        for(int num:nums)
        {
            if(num>max)
            max=num;
        }

        int freq[]=new int[max+1];
        int ct=0;
       for(int num:nums)
       {
          ct+=freq[num];
          freq[num]++;
       }

       return ct;
    }
}