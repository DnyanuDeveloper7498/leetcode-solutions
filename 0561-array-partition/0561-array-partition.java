class Solution {

    static 
    {
        Solution sol=new Solution();

        for(int i=0;i<500;i++)
        {
            sol.arrayPairSum(new int[]{0});
        }
    }



    public int arrayPairSum(int[] nums) {

        int min = min(nums);
        int max = max(nums);

     
        int freq[] = new int[max - min + 1];

        for (int num : nums) {
            freq[num - min]++;
        }

        int sum = 0;
        int index = 0;

        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {

                int value = i + min;

              
                if (index % 2 == 0) {
                    sum += value;
                }

                index++;
                freq[i]--;
            }
        }

        return sum;
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

    public static int max(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
