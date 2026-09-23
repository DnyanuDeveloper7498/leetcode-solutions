class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int start = matrix[0][0];
        int end = matrix[matrix.length - 1][matrix[0].length - 1];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int count = 0;

            for (int i = 0; i < matrix.length; i++) {

                int left = 0;
                int right = matrix[i].length - 1;

                while (left <= right) {

                    int m = left + (right - left) / 2;

                    if (matrix[i][m] <= mid) {
                        left = m + 1;
                    } else {
                        right = m - 1;
                    }
                }

                count += left;
            }

            if (count < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}
