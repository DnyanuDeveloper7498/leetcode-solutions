class Solution {
    public int countSegments(String s) {
        


        int ct=0;

        int ct2=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            { 
                 if(i>0 && s.charAt(i-1)!=' ')
                 {
                    ct++;
                 }
            }else
             {
                    ct2++;
             }
        }


        if(ct2==0) return 0;

        if(s.charAt(s.length()-1)!=' ')
         return ct+1;

         return ct;
    }
}