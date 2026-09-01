class Solution {
    public int[] getSneakyNumbers(int[] nums) {


        
    int max=max(nums);
        int freq[]=new int [max+1];
        
        for(int num:nums)
        {
            freq[num]++;
        }
        
        int size=0;
        
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>=2)
            {
                size++;
            }
        }
        
        
        int ans[]=new int [size];
        int index=0;
        
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>=2)
            {
                ans[index]=i;
                index++;
            }
        }
        
        return ans;
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