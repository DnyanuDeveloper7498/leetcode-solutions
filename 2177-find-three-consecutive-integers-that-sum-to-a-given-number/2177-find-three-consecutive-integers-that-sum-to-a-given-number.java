class Solution {
    public long[] sumOfThree(long num) {
        

       if(num%3!=0)
       {
             return new long[]{};
       }

         long arr[]=new long[3];

         for(int i=0;i<3;i++)
         {
            long curr=(num/3)-1;
             arr[i]=curr+i;
         }

             return arr;
      }
    
}