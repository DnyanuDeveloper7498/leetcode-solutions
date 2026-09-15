class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        int maxValue = Math.max(max(nums1), max(nums2));
        int minValue=Math.min(min(nums1),min(nums2));



         int freq1[]=new int [maxValue-minValue+1];
         int freq2[]=new int [maxValue-minValue+1];
      
          List<Integer>list1=new ArrayList<>(); 
          List<Integer>list2=new ArrayList<>();
       

         for(int num:nums1)
         {
            freq1[num-minValue]++;
         }

           for(int num:nums2)
         {
            freq2[num-minValue]++;
         }

         for(int i=0;i<freq1.length;i++)
         {
              if(freq1[i]!=0 && freq2[i]==0)
              {
                  list1.add(i+minValue);
               }
                
                
              if(freq1[i]==0 && freq2[i]!=0)
              {
                  list2.add(i+minValue);
               }
         }

          List<List<Integer>> result=new ArrayList<>();

               result.add(list1);
               result.add(list2);

            return result;
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