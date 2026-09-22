class Solution {
    public boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        int[] a = new int[26];
        for(int i = 0; i < str1.length(); i++) {
            a[str1.charAt(i) - 'a']++;
            a[str2.charAt(i) - 'a']--;
        }

        for(int i : a) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
