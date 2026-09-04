class Solution {
    public String reverseByType(String s) {

        char[] ch = s.toCharArray();

        int left = 0;
        int right = ch.length - 1;

      
        while (left < right) {

            while (left < right &&
                   !(ch[left] >= 'a' && ch[left] <= 'z')) {
                left++;
            }

            while (left < right &&
                   !(ch[right] >= 'a' && ch[right] <= 'z')) {
                right--;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        
        left = 0;
        right = ch.length - 1;

        while (left < right) {

            while (left < right &&
                   (ch[left] >= 'a' && ch[left] <= 'z')) {
                left++;
            }

            while (left < right &&
                   (ch[right] >= 'a' && ch[right] <= 'z')) {
                right--;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        return new String(ch);
    }
}
