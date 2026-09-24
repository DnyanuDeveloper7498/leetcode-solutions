
class Solution {
    public boolean checkIfExist(int[] arr) {

        int min = min(arr);
        int max = max(arr);

        int freq[] = new int[max - min + 1];

        
        for (int num : arr) {
            freq[num - min]++;
        }

    
        for (int num : arr) {

            int doubleNum = 2 * num;

     if (doubleNum >= min && doubleNum <= max) {

        
                if (doubleNum == num) {
                    if (freq[num - min] > 1)
                        return true;
                } 
                else {
                    if (freq[doubleNum - min] > 0)
                        return true;
                }
            }
        }

        return false;
    }

    public static int max(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max)
                max = num;
        }

        return max;
    }

    public static int min(int arr[]) {
        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min)
                min = num;
        }

        return min;
    }
}

    
    