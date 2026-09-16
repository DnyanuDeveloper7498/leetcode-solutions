class Solution {
    public String addStrings(String num1, String num2) 
    {
          char arr1[]=num1.toCharArray();
           char arr2[]=num2.toCharArray();

          
            int i=arr1.length-1;
            int j=arr2.length-1;
            int curr=0;

            StringBuilder ans=new StringBuilder();


             while(i>=0 || j>=0 || curr>0)
             {
                int n1=(i>=0)? arr1[i]-'0':0;
                int n2=(j>=0)? arr2[j]-'0':0;

                int sum=n1+n2+curr;

                 ans.append(sum%10);
                 curr=sum/10;

                i--;
                j--;
             }
       return ans.reverse().toString();
       
       
     }

}