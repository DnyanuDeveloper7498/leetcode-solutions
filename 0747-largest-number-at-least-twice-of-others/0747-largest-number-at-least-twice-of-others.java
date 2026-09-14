class Solution {
    public int dominantIndex(int[] nums) {
    
                 int max=max(nums);

                 int len=nums.length;

                 for(int i=0;i<len;i++)
                 {
                     if(max<2*nums[i] && nums[i]!=max)
                     {
                        return -1;
                     }
                 }


                 for(int i=0;i<len;i++)
                 {
                     if(max==nums[i])
                     {
                        return i;
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