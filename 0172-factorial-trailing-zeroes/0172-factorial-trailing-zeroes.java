class Solution {
    public int trailingZeroes(int n) {

        int ct=0;
        while(n>0)
        {
            n/=5;
            ct+=n;
        }
        return ct;
    }
}