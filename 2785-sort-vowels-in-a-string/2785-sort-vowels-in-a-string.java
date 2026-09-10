class Solution {
    public String sortVowels(String s) {
    
     char []arr=s.toCharArray();
     int  []freq = new int [10];

     char []v={'A','E','I','O','U','a','e','i','o','u'};

     boolean []vowel=new boolean[128];

     for(char ch:v) vowel[ch]=true;

     for(char ch:arr)
     {
         switch(ch)
         {
            case 'A': freq[0]++; break;
            case 'E': freq[1]++; break;
            case 'I': freq[2]++; break;
            case 'O': freq[3]++; break;
            case 'U': freq[4]++; break;
            case 'a': freq[5]++; break; 
            case 'e': freq[6]++; break;
            case 'i': freq[7]++; break; 
            case 'o': freq[8]++; break;
            case 'u': freq[9]++; break;
         }
     }



     int j=0;

     for(int i=0;i<arr.length;i++)
     {
        char ch =arr[i];

        if(vowel[ch])
        {
            while(freq[j]==0) j++;

            arr[i]=v[j];
            freq[j]--;
        }
     }


     return new String(arr); 
    }
}