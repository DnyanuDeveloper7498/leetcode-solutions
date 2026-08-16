class Solution {

  static 
  {
       Solution sol=new Solution();

       for(int i=0;i<500;i++)
       {
        sol.generate(0);
       }
  }


    public List<List<Integer>> generate(int numRows) {
    
     List<List<Integer>>ans=new ArrayList<>();

     for(int n=0;n<numRows;n++)
     {
         List<Integer>row=new ArrayList<>();

         long ncr=1;

         for(int r=0;r<=n;r++)
         {
            row.add((int)ncr);
            
            ncr=ncr*(n-r)/(r+1);
         }

         ans.add(row);
          
     }


      return ans;  
    }
}