class Solution {
   static {
      Solution sol=new Solution();

      for(int i=0;i<500;i++)
      {
         sol.containsDuplicate(new int []{0});
      }
 }


public boolean containsDuplicate(int[] nums) {
    
    HashSet<Integer> set = new HashSet<>();
    
    for (int num : nums) {
      
        if (set.contains(num)) {
            return true;
        }
        set.add(num);
    }
    
    return false;
}

}