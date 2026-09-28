class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] diff = new int[2051];

       
        for (int[] log : logs) {
            diff[log[0]]++;
            diff[log[1]]--;
        }

        int population = 0;
        int max = 0;
        int ans = 0;

        for (int year = 1950; year < 2050; year++) {

            population += diff[year];

            if (population > max) {
                max = population;
                ans = year;
            }
        }

        return ans;
    }
}
