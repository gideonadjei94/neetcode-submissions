class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> anagramMap = new HashMap<>();
        for (String s : strs){
            char[] letterCount = new char[26];
            for (char c: s.toCharArray()){
                letterCount[c - 'a']++;
            }
            String key = Arrays.toString(letterCount);
            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
