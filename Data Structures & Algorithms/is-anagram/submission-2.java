class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] a = new int[26];
        char[] sc = new char[s.length()];
        s.getChars(0, s.length(), sc, 0);
        char[] tc = new char[t.length()];
        t.getChars(0, t.length(), tc, 0);

        for(int i = 0; i < sc.length; i++) {
            a[sc[i] - 'a']++;
            a[tc[i] - 'a']--;
        }

        for(int i : a) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
