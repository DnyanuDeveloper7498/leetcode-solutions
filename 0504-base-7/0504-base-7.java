class Solution {
    public String convertToBase7(int num) {

        if(num == 0) return "0";

        boolean isNegative = num < 0;

        if(num < 0) num = -num;

        StringBuilder ans = new StringBuilder();

        while(num != 0)
        {
            int rem = num % 7;
            ans.append(rem);
            num /= 7;
        }

        ans.reverse();

        if(isNegative)
            ans.insert(0, "-");

        return ans.toString();
    }
}