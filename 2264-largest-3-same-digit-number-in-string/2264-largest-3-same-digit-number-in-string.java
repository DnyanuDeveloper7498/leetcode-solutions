class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder ans = new StringBuilder();

        int ct = 1;
        int max = -1;

        for (int i = 1; i <= num.length(); i++) {

            if (i < num.length() && num.charAt(i - 1) == num.charAt(i)) {
                ct++;
            } else {

                if (ct >= 3) {
                    char ch = num.charAt(i - 1);
                    int digit = ch - '0';

                    if (digit > max) {
                        max = digit;

                        StringBuilder temp = new StringBuilder();

                        for (int k = 0; k <3; k++) {
                            temp.append(ch);
                        }

                        ans = temp;
                    }
                }

                ct = 1;
            }
        }

        return ans.toString();
    }
}
