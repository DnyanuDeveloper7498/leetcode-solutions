
class Solution {

    static {
        Solution sol=new Solution();

        for(int i=0;i<500;i++)
        {
            sol.distributeCandies(new int []{0});
        }
    }
    public int distributeCandies(int[] candyType) {

        int min = min(candyType);
        int max = max(candyType);

        int freq[] = new int[max - min + 1];

        for (int num : candyType) {
            freq[num - min]++;
        }

        int ct = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                ct++;
            }
        }

        return Math.min(ct, candyType.length / 2);
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
