class Solution {
    public int countNegatives(int[][] grid) {

            
         int ct=0;

          for(int i=0;i<grid.length;i++)
          {
              int left=0;
              int right=grid[i].length-1;

              while(left<=right)
              {

                  int mid=left+(right-left)/2;

                  if(grid[i][mid]<0)
                  {
                     right=mid-1;
                  }
                  else
                  {
                     left=mid+1;
                  }

              }

              ct+=grid[i].length-left;
          }
      
           
          return ct;
  
         

        
    }
}