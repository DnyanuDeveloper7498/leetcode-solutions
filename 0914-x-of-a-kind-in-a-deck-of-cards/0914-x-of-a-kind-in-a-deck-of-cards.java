class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        

       int max=max(deck)+1;

       int freq[]=new int [max];

         for(int num:deck)
         {
            freq[num]++;
         }


    

          int gcd=0;
    
        for(int num:freq)
        {
             if(num>0)
             {
                 gcd =findGcd(gcd,num);
             }
        }
        return gcd>1;
    }


public static int findGcd(int a, int b) 
{ 
    while (b != 0) 
    { 
        int temp = a % b;
         a = b; b = temp; 
        
     }
       return a; 
     
 }

    public static int max(int arr[])
    {
        int max=Integer.MIN_VALUE;

        for(int num:arr)
        {
          if(num>max)
          {
            max=num;
          }
        }
      return max;
    }

   

}