class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> ans = new ArrayList<>();

        int smaller = 0;
        int targetCount = 0;

        for (int num : nums) {
            if (num < target) {
                smaller++;
            } else if (num == target) {
                targetCount++;
            }
        }

        for (int i = 0; i < targetCount; i++) {
            ans.add(smaller + i);
        }

        return ans;
    }
}
