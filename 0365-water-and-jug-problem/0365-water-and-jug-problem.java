class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        

        if( target>x+y)
        {
            return false;
        }

        int gcd=1;
        int min = x < y ? x : y;

        for(int i=min;i>=1;i--)
        {
            if(x%i==0 && y%i==0)
            {
                gcd=i;
                break;
            }
        }

        return target%gcd==0;
    }
}