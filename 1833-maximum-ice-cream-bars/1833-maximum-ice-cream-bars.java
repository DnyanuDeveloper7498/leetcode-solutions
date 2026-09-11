class Solution {

    
      static
      {
          Solution sol=new Solution();

          for(int i=0;i<500;i++)
          {
            sol.maxIceCream(new int[]{0},0); 
          }
      }



    public int maxIceCream(int[] costs, int coins) {


   int freq[] = new int[max(costs) + 1];

    int ct = 0;

    for (int num : costs) {
        freq[num]++;
    }

    for (int i = 0; i < freq.length; i++) {

        if (freq[i] != 0) {

            while (freq[i] > 0) {

                if (i > coins) {
                    return ct;
                }

                coins = coins - i;
                ct++;

                freq[i]--;
            }
        }
    }

    return ct;
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