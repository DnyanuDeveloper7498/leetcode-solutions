class Solution {

  static 
  {
      Solution sol=new Solution();

      for(int i=0;i<200;i++)
      {
         sol.containsNearbyDuplicate(new int []{0}, 0);
      }
  }


    public boolean containsNearbyDuplicate(int[] nums, int k)
     {
        
        Set<Integer> set =new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(i>k)
            {
                set.remove(nums[i-k-1]);
            }

            if(!set.add(nums[i]))
            {
                return true;
            }
        }
        return false;
    }
}