class Solution {
    public boolean isPalindrome(String s) {

         int left = 0, right = s.length() - 1;
        String ls = s.toLowerCase();

        while (left < right){
            while (left < right && !alphaNum(ls.charAt(left)))
                left++;
            while (left < right && !alphaNum(ls.charAt(right)))
                right--;

            if (ls.charAt(left) != ls.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;   
    }

       static boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
