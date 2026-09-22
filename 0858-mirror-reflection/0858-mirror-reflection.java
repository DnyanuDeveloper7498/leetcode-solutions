class Solution {
    public int mirrorReflection(int p, int q) 
    {

        int g=gcd(p,q);

        int a=p/g;
        int b=q/g;

        if(a%2==0)
        {
            return 2;
        }

        if(b%2==1)
        {
            return 1;
        }

   return 0;
        
    }


    public static int gcd(int a,int b)
    {
        int min= a<b ? a:b;

        for(int i=min;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                return i;
            }
        }
        return 1;
    }
}