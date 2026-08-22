class Solution {
    public int mySqrt(int x) {

        if(x==0)
        return 0;

        long root=x;

        while(root>x/root)
        {
            root=(root+x/root)/2;
        }
      return (int) root;    
    }
}