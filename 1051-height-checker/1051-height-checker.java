class Solution {
    public int heightChecker(int[] heights) 
    {
        int size=max(heights);

      int freq[]=new int [size+1];

      for(int i=0;i<heights.length;i++)
      {
         freq[heights[i]]++;
      }

     int index=0;
     int ct=0;

     for(int i=0;i<=size;i++)
     {
        while(freq[i]>0)
        {
            
           if(heights[index]!=i)
           {
              ct++;
           }
      

            freq[i]--;
            index++;
        }
     }
return ct;
        
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