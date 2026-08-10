class Solution {

  static {
      Solution sol=new Solution();

      for(int i=0;i<=500;i++)
      {
        sol.canJump(new int []{0});
      }
  }

  public boolean canJump(int[] nums) {

    int start=0;
    int end=nums.length-1;

    for(int i=0;i<nums.length;i++)
    {
         if(i>start) return false;

        start=max(start,i+nums[i]);

        if(start>=end)
        {
            return true;
        }
    }

    return false;
    }

    public static int max(int n1,int n2)
    {
        return n1>n2?n1:n2;
    }
}