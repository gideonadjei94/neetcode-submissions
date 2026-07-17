class Solution {
    public int characterReplacement(String s, int k) {
         HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, longestSeq = 0, maxChar = 0;

        for(int r = 0; r < s.length(); r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxChar = Math.max(maxChar, map.get(s.charAt(r)));

            while ((r - l + 1) - maxChar > k){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            longestSeq = Math.max(longestSeq, r - l + 1);
        }


        return longestSeq;
    }
}
