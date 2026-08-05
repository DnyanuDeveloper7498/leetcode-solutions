class Solution {
    public int[] transformArray(int[] nums) {
        
    int start = 0;
    int end = nums.length - 1;

    while(start <= end)
    {
        if(nums[start] % 2 == 0)
        {
            nums[start] = 0;
            start++;
        }
        else
        {
            nums[start] = 1;
            
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            end--;
        }
    }

    return nums;
    }
}