class Solution {

  private static final  boolean isVowels[]=new boolean [128];

  static 
  {
     isVowels['a']=true;
     isVowels['e']=true;
     isVowels['i']=true;
     isVowels['o']=true;
     isVowels['u']=true;

      isVowels['A']=true;
      isVowels['E']=true;
      isVowels['I']=true;
      isVowels['O']=true;
      isVowels['U']=true;
  }

    public String reverseVowels(String s) {
        
    char str[]=s.toCharArray();

    int left=0;
    int right=str.length-1;


      while(left<=right)
      {
          if(!isVowels[str[left]])
          {
            left++;
          }
          else if(!isVowels[str[right]])
          {
            right--;
          }
          else
          {
              char temp=str[left];
              str[left]=str[right];
              str[right]=temp;

              left++;
              right--;
        
          }
      }
       return new String(str);
    }
}