class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> a = new ArrayList<>();
        a.add(new ArrayList());
        a.get(0).add(strs[0]);
        outerloop:
        for(int i = 1; i < strs.length; i++) {
            for(int j = 0; j < a.size(); j++) {
                if(isAnagram(a.get(j).get(0), strs[i])) {
                    a.get(j).add(strs[i]);
                    continue outerloop;
                }
            }
            a.add(new ArrayList());
            a.get(a.size() - 1).add(strs[i]);
        }

        String[][] r = new String[a.size()][];
        for(int i = 0; i < a.size(); i++) {
            r[i] = a.get(i).toArray(new String[0]);
        }

        return a;
    }

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
