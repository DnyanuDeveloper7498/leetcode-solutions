class Solution {
    
    
    public  int value(char ch)
   {   
  switch(ch) {
        case 'M': return 1000;
        case 'D': return 500;
        case 'C': return 100;
        case 'L': return 50;
        case 'X': return 10;
        case 'V': return 5;
        case 'I': return 1;
           }
    return 0;
   }


    public int romanToInt(String s) {
     
       int result=0;

        for(int i=0;i<s.length();i++)
        {
          int currentVal=value(s.charAt(i));

           if(i+1<s.length() && currentVal<value(s.charAt(i+1)))
           {
             result-=currentVal;
           }
           else 
           {
            result+=currentVal;
           }
        }
       return result;
    }
   
}