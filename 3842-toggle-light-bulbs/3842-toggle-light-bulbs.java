class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        
   
   int freq[]=new int[101];

     for(int num:bulbs)
     {
         freq[num]++;
     }

   ArrayList<Integer> ans=new ArrayList<>();

       for(int i=1;i<101;i++)
       {
          if(freq[i]%2!=0)
          {
            ans.add(i);
          }
       }

        return ans;
    }


}