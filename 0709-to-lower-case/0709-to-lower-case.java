class Solution {
    public String toLowerCase(String s) {

    char ch[]=s.toCharArray();
    
    char ans[]=new char[ch.length];

     for(int i=0;i<ch.length;i++)
     {
        if(ch[i]>='A' && ch[i]<='Z')
        {
            ans[i]=(char)(ch[i]+32);
        }
        else
        {
            ans[i]=ch[i];
        }
     }

     return new String(ans);   
    }
}