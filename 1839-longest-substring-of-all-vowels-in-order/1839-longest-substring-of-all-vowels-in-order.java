class Solution {
    public int longestBeautifulSubstring(String word) {
        
        int n=word.length();
        int i=0;
        int max=0;

        while(i<n)
        {
            if(word.charAt(i)!='a')
            {
                i++;
                continue;
            }

            int start=i;
            
            while(i<n && word.charAt(i)=='a')
            {
                i++;
            }

            if(i>=n || word.charAt(i)!='e')
            {
                continue;
            }

            while(i<n && word.charAt(i)=='e')
            {
                i++;
            }
             if(i>=n || word.charAt(i)!='i')
            {
                continue;
            }

            while(i<n && word.charAt(i)=='i')
            {
                i++;
            }
             if(i>=n || word.charAt(i)!='o')
            {
                continue;
            }

            while(i<n && word.charAt(i)=='o')
            {
                i++;
            }

             if(i>=n || word.charAt(i)!='u')
            {
                continue;
            }

            while(i<n && word.charAt(i)=='u')
            {
                i++;
            }

            max=Math.max(max,i-start);
        }

   return max;
    }
}