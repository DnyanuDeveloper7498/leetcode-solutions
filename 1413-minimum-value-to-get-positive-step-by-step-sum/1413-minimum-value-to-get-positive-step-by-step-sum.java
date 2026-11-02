class Solution {
    public int minStartValue(int[] nums) {
        
        int sum=0;
        int min=0;

      for(int num:nums)
      {
        sum+=num;
         if(sum<min)
         {
            min=sum;
         }
      }
   return 1-min;
    }
}