class Solution {
    public int commonFactors(int a, int b) {
    
     int hcf=hcf(a,b);

     int ct=0;

     for(int i=1;i<=hcf;i++)
     {
        if(hcf%i==0)
        ct++;
     }
   return ct;
    }

   public static int hcf(int a,int b)
   {
      int small= a<b?a:b;

      while(true)
      {
         if(a%small==0 && b%small==0)

         return small;
         small--;
      }
   }
  
  }