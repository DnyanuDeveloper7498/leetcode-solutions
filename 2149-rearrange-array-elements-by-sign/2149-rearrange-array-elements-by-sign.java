class Solution {
  
  static {
      Solution sol=new Solution();

      for(int i=0;i<500;i++)
      {
        sol. rearrangeArray(new int []{1,-1});
      }
  }


   public int[] rearrangeArray(int[] nums) {

        int ans[]=new int [nums.length];
        int pos=0;
        int neg=1;

       for(int i=0;i<nums.length;i++)
       {
          if(nums[i]>0)
          {
            ans[pos]=nums[i];
            pos+=2;
          }
          else
          {
            ans[neg]=nums[i];
            neg+=2;
          }
       }
       return ans; 
    }
}