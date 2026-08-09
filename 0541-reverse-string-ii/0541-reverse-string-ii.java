class Solution {


    public String reverseStr(String s, int k) {

        char str[]=s.toCharArray();

        for(int i=0;i<str.length;i+= 2*k)
        {
            int j=Math.min(i+k-1,str.length-1);

            revers(str,i,j);
        }
        
        return new String(str);
    }


    public static void revers(char str[],int i,int j)
    {
        while(i<=j)
        {
          char temp=str[i];
            str[i]=str[j];
            str[j]=temp;

            i++;
            j--;
        }
    }

}