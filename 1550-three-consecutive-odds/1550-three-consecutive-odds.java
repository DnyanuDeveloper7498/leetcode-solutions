class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int odd=0;

        for(int num:arr)
        {
            if(num%2!=0)
            {
               odd++;
               if(odd==3) return true;
            }
            else
             odd=0;
        }
        return false;
    }
}