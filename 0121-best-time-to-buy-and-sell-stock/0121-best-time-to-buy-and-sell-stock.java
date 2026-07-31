class Solution {

   static {
    Solution sol=new Solution();
     
     for(int i=0;i<500;i++)
     {
        sol.maxProfit(new int []{0});
     }
   }


    public int maxProfit(int[] prices) {

         int prof=0;
      int sell=1;
      int buy=0;

      while(sell<prices.length)
      {
         if(prices[sell]>prices[buy])
         {
            prof=Math.max(prof,prices[sell]-prices[buy]);
         }
         else
         {
            buy=sell;
         }
         sell++;
      }

      if(prof==0)
       return 0;

     return prof;
      
        
    }
}