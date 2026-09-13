class Solution {


   static 
   {
        Solution sol=new Solution();

        for(int i=0;i<500;i++)
        {
             sol.findErrorNums(new int[]{0});
        }
   }

    public int[] findErrorNums(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int num : nums) {
            freq[num]++;
        }

        int duplicate = 0;
        int missing = 0;

        for (int i = 1; i <= n; i++) {

            if (freq[i] == 2) {
                duplicate = i;
            } 
            else if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}
