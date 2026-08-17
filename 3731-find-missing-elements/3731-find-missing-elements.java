class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        

         List<Integer> list =new ArrayList<>();

         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;

         for(int num:nums)
         {
            if(min>num) min=num;
            if(num>max) max=num;
         }

         boolean isPresent[]=new boolean [max+1];

         for(int num:nums)
         {
            isPresent[num]=true;
         }

         for(int i=min;i<=max;i++)
         {
             if(!isPresent[i])
             {
                list.add(i);
             }

         }

         return list;
    }
}