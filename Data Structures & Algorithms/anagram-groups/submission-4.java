class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> a = new HashMap<>();
        for(String s : strs) {
            int[] i = new int[26];
            char[] ca = s.toCharArray();
            for(char c : ca) {
                i[c - 'a']++;
            }
            String sz = Arrays.toString(i);
            a.putIfAbsent(sz, new ArrayList<>());
            a.get(sz).add(s);
        }
        return new ArrayList<>(a.values());
    }
}
