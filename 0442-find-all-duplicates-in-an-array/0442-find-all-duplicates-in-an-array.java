class Solution {

  static {
    Solution sol=new Solution();

    for(int i=0;i<500;i++)
    {  
        sol.findDuplicates(new int[]{0});

    }
  }

    public List<Integer> findDuplicates(int[] nums) {

        int freq[]=new int [max(nums)+1];
        
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }

        ArrayList <Integer> list =new  ArrayList<>();

        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>1)
            {
                list.add(i);
            }
        }
        return list;
    }

    public static int max(int arr[])
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        return max;
    }
}