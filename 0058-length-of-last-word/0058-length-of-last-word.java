class Solution {
    public int lengthOfLastWord(String s) {
        

        int end=s.length()-1;

        int ct=0;

        while(end>=0)
        {
            if(s.charAt(end)!=' ')
                 ct++;
            else if (ct>0)
              break;
              end--;
        }
        return ct;
    }
}