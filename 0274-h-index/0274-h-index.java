class Solution {

    public int hIndex(int[] citations) 
    {
       int freq[]=new int [max(citations)+1];

       for(int num:citations)
       {
          freq[num]++;
       }
       
    int pep=0;

       for(int i=freq.length-1;i>=0;i--)
       {
         pep+=freq[i];

         if(pep>=i)
         {
            return i;
         }
       }

       return 0;
        
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
}