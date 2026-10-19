class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
 {
      Map<String,List<String>> map=new   HashMap<>();

      for(String str:strs)
      {
        char []chars =str.toCharArray();
         Arrays.sort(chars);

         String key=new String(chars);

         map.putIfAbsent(key,new ArrayList<>());
         map.get(key).add(str);
      }

      return new ArrayList<>(map.values());
    
  }

   public static boolean isAnagram(String str1, String str2) {
    

    if(str1.length()!=str2.length())
    {
        return false;
    }

    char freq[]=new char[26];
    char ch[]=str1.toCharArray();

    for(char cha:ch)
    {
        freq[cha-'a']++;
    }

    char ch2[]=str2.toCharArray();

      for(char cha:ch2)
    {
        freq[cha-'a']--;
    }
   

   for(char c:freq)
   {
     if(c!=0)
     {
        return false;
     }
   }
   
   return true;
   }
}