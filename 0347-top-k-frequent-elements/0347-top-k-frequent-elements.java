import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int min = nums[0], max = nums[0];

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        final int offset = min;

        int[] freq = new int[max - min + 1];

        for (int n : nums)
            freq[n - min]++;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(  
            freq[b - offset], freq[a - offset])
        );

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0)
                pq.offer(i + min);
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++)
            ans[i] = pq.poll();

        return ans;
    }
}