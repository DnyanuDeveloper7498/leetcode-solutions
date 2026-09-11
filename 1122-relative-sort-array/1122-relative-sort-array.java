class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2)
    {

        int freq[]=new int [max(arr1)+1];

        for(int num:arr1)
        {
           freq[num]++;
        }


    int index=0;

    for(int i=0;i<arr2.length;i++)
    {
        int num=arr2[i];

        while(freq[num]>0)
        {
          arr1[index]=num;
          index++;
          freq[num]--;

        }
    }


    for(int i=0;i<freq.length;i++)
    {
        while(freq[i]>0)
        {
            arr1[index++]=i;
            freq[i]--;
        }
    }



return arr1;

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