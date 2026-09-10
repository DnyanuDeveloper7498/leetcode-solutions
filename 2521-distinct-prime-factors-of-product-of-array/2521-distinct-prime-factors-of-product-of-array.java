class Solution {
    public int distinctPrimeFactors(int[] nums) {


    boolean isPresent[]=new boolean [1000001];
    int ct=0;

     for(int i=0;i<nums.length;i++)
     {
         int n=nums[i];

         while(n>1)
         {
            int prime=primeFactor(n);
            if(!isPresent[prime])
            {
                isPresent[prime]=true;
                ct++;
            }
            n/=prime;
         }
     }

     return ct;
        
    }


  public static int primeFactor(int n)
  {
    
     if(n%2==0) return 2;

     for(int i=3;i*i<=n;i+=2)
     {
        if(n%i==0)
        {
            return i;
        }
     }
    return n;
  }
}