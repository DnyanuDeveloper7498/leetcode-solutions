class Solution {


     static {
        Solution sol=new Solution();
        for(int i=0;i<500;i++)
        {
            sol.findTheDifference("hellow","how");
        }
     }
    public char findTheDifference(String s, String t) {
        
      char result=0;

       for(char ch:s.toCharArray())
       {
          result^=ch;
       }

         for(char ch:t.toCharArray())
       {
          result^=ch;
       }
    
      return result;
    }
}