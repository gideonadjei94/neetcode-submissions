class Solution {
    public boolean checkInclusion(String s1, String s2) {
      if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int window = s1.length();

        for (int i = 0; i < window; i++) {
            s2Count[s2.charAt(i) - 'a']++;
        }

        if (Arrays.toString(s1Count).equals(Arrays.toString(s2Count))) return true;

        for (int i = window; i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 'a']++;
            s2Count[s2.charAt(i - window) - 'a']--;

            if (Arrays.toString(s1Count).equals(Arrays.toString(s2Count))) return true;
        }

        return false;
    }
}
