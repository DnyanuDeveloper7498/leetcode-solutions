class Solution {
    public String sortSentence(String s) {

     char arr[]=s.toCharArray();
      StringBuilder sb=new StringBuilder();

      String ans[]=new String[9];

      for(char ch:arr)
      {
          if(ch==' ') continue;

          if(ch>='1' && ch<='9')
          {
            ans[ch-'1']=sb.toString();
            sb.setLength(0);
          }
          else
          {
            sb.append(ch);
          }
      }


       StringBuilder res=new StringBuilder();

       for(String word:ans)
       {
          if(word!=null)
          {
            if(res.length()>0)
            {
              res.append(" ");
            }
            res.append(word);
          }
       }
        

    return res.toString();
    }
}