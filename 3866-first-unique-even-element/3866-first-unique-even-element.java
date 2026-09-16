class Solution {
    public int firstUniqueEven(int[] nums) 
    {
        int freq[]=new int[max(nums)+1];

        for(int num:nums)
        {
            if(num%2==0)
            {
               freq[num]++;
            }
        }


        for(int i=0;i<nums.length;i++)
        {
             int num=nums[i];

             if(freq[num]==1)
             {
                return num;
             }
            
        }

        return -1;
        
    }

 public static int max(int arr[])
 {
     int max=Integer.MIN_VALUE;

     for(int num:arr)
     {
        if(num>max)
        {
            max=num;
        }
     }
     return max;
 }
}