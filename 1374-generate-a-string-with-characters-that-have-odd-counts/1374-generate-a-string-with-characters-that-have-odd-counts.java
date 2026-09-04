class Solution {
    public String generateTheString(int n) {

        StringBuilder ans = new StringBuilder(n);

         if(n%2!=0)
         {
            for(int i=0;i<n;i++)
            {
                ans.append('a');
            }
         }
         else
         {
             for(int i=0;i<n-1;i++)
             {
                ans.append('a');
             }
            
            ans.append('b');
         }



         return ans.toString();
    }
}
