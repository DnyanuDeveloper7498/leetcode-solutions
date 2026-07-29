class Solution {
    
    static{
        Solution sol=new Solution();

        for(int i=0;i<500;i++)
        {
            sol.findNumbers(new int []{0});
        }
    }
    
    public int findNumbers(int[] nums) {
   
     int ct=0;


       for(int i=0;i<nums.length;i++)
       {
          if(isEven(nums[i]))
          {
            ct++;
          }
       }

    return ct;

    }


    public static boolean isEven(int num)
    {
        int ct=0;
         while(num!=0)
         {
            ct++;
            num/=10;
         }

         return ct%2==0;
    }
}