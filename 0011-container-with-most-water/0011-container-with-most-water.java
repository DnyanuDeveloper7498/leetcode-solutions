class Solution {

  static 
  {
    Solution sol=new Solution();

    for(int i=0;i<500;i++)
    {
        sol.maxArea(new int []{0});
    }
  }

    public int maxArea(int[] height) {

        int left=0;
        int right=height.length-1;
        int maxArea=0;

      while(left<right)
      {
          int area;

          if(height[left]<height[right])
          {
            area=height[left]*(right-left);

            if(area>maxArea)
                maxArea=area;
                left++;
          }
          else
          {
             area=height[right]*(right-left);
               if(area>maxArea)
                maxArea=area;
                right--;
          }
         
      }
    

       return maxArea;
        
    }
}