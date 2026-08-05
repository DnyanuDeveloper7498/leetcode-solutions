class Solution {


     static {
         Solution sol=new Solution();

         for(int i=0;i<500;i++)
         {
            sol.digitFrequencyScore(0);
         }
     }
    public int digitFrequencyScore(int n) {

       int sum=0;
       for(int i=0;i<=9;i++)
       {
         int ct=0;
         int temp=n;
         int mul=0;

         while(temp!=0)
         {
            if(temp%10==i)
            {
                ct++;
            }
            temp/=10;
         }
        
         if(ct>0)
         {
            mul=ct*i;

            sum+=mul;
         }
 
       }
      
      return sum;
     
    }

        
    
}