class Solution {
    public int countDistinctIntegers(int[] nums) {
        
    
        int len=nums.length;
        int rev[]=new int[2*len];

        for(int i=0;i<len;i++)
        {
           rev[2*i]=nums[i];
           rev[2*i+1]=revers(nums[i]);
        }

        int freq[]=new int[max(rev)+1];
        
        int ct=0;
        for(int num:rev)
        {
            if(freq[num]==0)
            {
                ct++;
            }
           freq[num]++;
        }
 
     return ct;

     }
   
   public static int max(int arr[])
   {
       int max=Integer.MIN_VALUE;

       for(int num:arr)
       {
         if(num>max)
          max=num;
       }
       return max;
   }

    public static int revers (int num)
      {
          
         int rev=0;

         while(num!=0)
         {
            rev=rev*10+num%10;
            num/=10;
         }
         return rev;
      }
}