class Solution {
    public List<String> letterCombinations(String digits) {
        
     List<String> ans = new ArrayList<>();

     if(digits==null||digits.isEmpty())
     {
        return ans;
     }

      String[] phone = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
    
    ans.add("");

     for(int i=0;i<digits.length();i++)
     {
        String letter=phone[digits.charAt(i)-'0'];

        List<String> temp = new ArrayList<>(ans.size()*letter.length());
        
        for(String s :ans)
        {
            for(int j=0;j<letter.length();j++)
            {
                StringBuilder sb=new StringBuilder(s);
                sb.append(letter.charAt(j));
                temp.add(sb.toString());
            }
        }

        ans=temp;

     }
    
     return ans;

    }
}