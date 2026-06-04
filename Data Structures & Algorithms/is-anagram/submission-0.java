class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int length = s.length();
        for(int i = 0; i < length; i++) {
            int b = t.indexOf(s.charAt(0));
            if(b != -1) {
                s = s.substring(1);
                t = t.substring(0, b) + t.substring(b + 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
