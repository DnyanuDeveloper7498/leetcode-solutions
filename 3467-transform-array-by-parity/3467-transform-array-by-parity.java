class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int index = 0;

        
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[index++] = 0;
            }
        }

        // Fill remaining positions as 1
        while (index < nums.length) {
            ans[index++] = 1;
        }

        return ans;
    }
}