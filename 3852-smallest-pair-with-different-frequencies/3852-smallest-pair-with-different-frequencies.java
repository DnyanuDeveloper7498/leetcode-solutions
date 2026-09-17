class Solution {
    public int[] minDistinctFreqPair(int[] nums) {



    int max = max(nums) + 1;

    int freq[] = new int[max];

   
    for (int num : nums) {
        freq[num]++;
    }

    int min = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;

    for (int i = 0; i < max; i++) {

        if (freq[i] != 0) {

            
            if (i < min) {
                min = i;
            }
        }
    }

    for (int i = min + 1; i < max; i++) {

        if (freq[i] != 0 && freq[i] != freq[min]) {
            secondMin = i;
            break;
        }
    }

    if (secondMin == Integer.MAX_VALUE) {
        return new int[]{-1, -1};
    }

    return new int[]{min, secondMin};
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