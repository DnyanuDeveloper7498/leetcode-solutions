class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len=nums.length;

        int j=0;

        for(int i=0;i<len;i++)
        {
            if(i==0|| nums[i]!=nums[i-1])
            {
                nums[j]=nums[i];
                j++;
            }
        }

        return j;

    }
}