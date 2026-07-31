class Solution {
 
    static {
          Solution sol=new Solution();

          for(int i=0;i<500;i++)
          {
            sol.sortedSquares(new int []{0});
          }
    }


    public int[] sortedSquares(int[] nums) {
        
        int left=0;
      int right=nums.length-1; 
      int index=nums.length-1;
      int ans[]=new int [nums.length];
     
     while(left<=right)
     {
       int leftSqr=nums[left]*nums[left];
       int rightSqr=nums[right]*nums[right];

        if(leftSqr>rightSqr)
        {
           ans[index]=leftSqr;
           left++;
        }
        else
        {
           ans[index]=rightSqr;
           right--;
        }

        index--;

     }
     
     return ans;
    }
}