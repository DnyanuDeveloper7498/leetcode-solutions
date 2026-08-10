class Solution {
  
   static 
   {
      Solution sol=new Solution();
       
       for(int i=0;i<500;i++)
       {
        sol.canCompleteCircuit(new int[]{0},new int[]{0});
       }
   }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        
       int start=0;
       int currTank=0; 
       int total=0;
   
       for(int i=0;i<gas.length;i++)
       {
         int diff=gas[i]-cost[i];
        
         currTank+=diff;
         total+=diff;

         if(currTank<0)
         {
            start=i+1;
            currTank=0;
         }          

       }

     return total<0?-1:start;
    }
}