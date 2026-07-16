class Solution {
    public boolean isSameAfterReversals(int num) {

       int rev=0;
      int orgNum=num;

      for(int i=0;i<2;i++)
      {
        int temp=num;
            rev=0;
         while(temp!=0)
         {
            rev=rev*10+temp%10;
            temp/=10;
         }
         num=rev;
      }

      return rev==orgNum;



    }
}