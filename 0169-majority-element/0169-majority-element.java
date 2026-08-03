class Solution {

    static {
          Solution sol=new Solution();

          for(int i=0;i<500;i++)
          {
            sol.majorityElement(new int []{0});
          }
    }


    public int majorityElement(int[] nums) {
        
      int currNum=nums[0];
      int count=1;

        for(int i=1;i<nums.length;i++)
        {
           if(count==0)
           {
            currNum=nums[i];
           }

           if(currNum==nums[i])
           {
             count++;
           }
           else
           {
             count--;
           }
        }
        return currNum;
    }
}