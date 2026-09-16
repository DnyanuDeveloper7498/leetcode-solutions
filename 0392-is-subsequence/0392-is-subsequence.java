class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

    char ch1[] = s.toCharArray();
    char ch2[] = t.toCharArray();

    int len = ch1.length;

    int i = 0;
    int j = 0;

    while (i < len && j < ch2.length) {
        if (ch1[i] == ch2[j]) {
            i++;
        }
        j++;
    }

    return i == len;
  }
}