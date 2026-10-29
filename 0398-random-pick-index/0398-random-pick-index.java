class Solution {

    HashMap<Integer,ArrayList<Integer>> map =new HashMap<>();
    Random r=new Random();

    public Solution(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
    }
    
    public int pick(int target) {

        ArrayList<Integer> index=map.get(target);
        return index.get(r.nextInt(index.size()));
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */