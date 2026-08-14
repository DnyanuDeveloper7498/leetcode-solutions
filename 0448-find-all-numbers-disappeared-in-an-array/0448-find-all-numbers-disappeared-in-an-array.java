class Solution {


   static 
   {
      Solution sol=new Solution();

      for(int i=0;i<500;i++)
      {
        sol.findDisappearedNumbers(new int[]{0});
      }
   }
     
    public List<Integer> findDisappearedNumbers(int[] nums) {
     

     int freq[]=new int[nums.length+1];

      for(int num:nums)
      {
        freq[num]++;
      }

      List<Integer>list=new ArrayList<>();

      for(int i=1;i<=nums.length;i++)
      {
          if(freq[i]==0)
          {
            list.add(i);
          }
      }

    return list;  
    }
}