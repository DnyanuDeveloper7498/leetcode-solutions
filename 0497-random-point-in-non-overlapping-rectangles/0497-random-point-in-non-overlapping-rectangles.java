class Solution {
  
  int [][] rects;
  int [] prefix;
  
  Random random;



    public Solution(int[][] rects) {

        this.rects=rects;
        this.random=new Random();

        int n=rects.length;
        prefix=new int[n];

        int sum=0;

        for(int i=0;i<n;i++)
        {
            int x1=rects[i][0];
            int y1=rects[i][1];
            int x2=rects[i][2];
            int y2=rects[i][3];

            int points=(x2-x1+1)*(y2-y1+1);

           sum+=points;
           prefix[i]=sum;

        }
        
    }
    
    public int[] pick() {



        int total=prefix[prefix.length-1];

        int target=random.nextInt(total)+1;

        int left=0;
        int right=prefix.length-1;

        while(left<right)
        {
            int mid=left+(right-left)/2;

            if(prefix[mid]<target)
            {
                left=mid+1;
            }else
            {
                right=mid;
            }
        }


         int[] rect = rects[left];

        int prev = (left == 0) ? 0 : prefix[left - 1];

        int index = target - prev - 1;

        int width = rect[2] - rect[0] + 1;

        int x = rect[0] + index % width;
        int y = rect[1] + index / width;

        return new int[]{x, y};
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */