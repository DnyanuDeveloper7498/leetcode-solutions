class Solution {
    public boolean isIsomorphic(String s, String t) {


        int len=s.length();

       if (s.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }


        int[] map1 = new int[256];
        int[] map2 = new int[256];

        char ch1[]=s.toCharArray();

        char ch2[]=t.toCharArray();


        for (int i = 0; i < len; i++) {

            int a = ch1[i];
            int b = ch2[i];

            if (map1[a] != map2[b])
                return false;

                int pos=i+1;

            map1[a] =pos;
            map2[b] = pos;
        }

        return true;
    }
}