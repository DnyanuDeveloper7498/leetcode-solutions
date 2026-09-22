class Solution {
    public int findGCD(int[] nums) 
    {

        int max=max(nums);
        int min=min(nums);

          int gcd=1;
    
        for(int i=min;i>=1;i--)
        {
             if(max%i==0 && min%i==0)
             {
                gcd=i;
                break;
             }
        }
        return gcd;
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

     public static int min(int arr[])
    {
        int min=Integer.MAX_VALUE;

        for(int num:arr)
        {
          if(num<min)
          {
            min=num;
          }
        }
      return min;
    }

}