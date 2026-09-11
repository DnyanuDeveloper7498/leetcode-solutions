class Solution {
    public int[] sortArray(int[] nums) {

        int min = min(nums);
        int max = max(nums);

        int freq[] = new int[max - min + 1];

        int ans[] = new int[nums.length];

       
        for (int num : nums) {
            freq[num - min]++;
        }

      
        int index = 0;

        for (int i = 0; i < freq.length; i++) {

            while (freq[i] > 0) {

                ans[index] = i + min;

                index++;
                freq[i]--;
            }
        }

        return ans;
    }

    public static int max(int arr[]) {

        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static int min(int arr[]) {

        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }
}
