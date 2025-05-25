// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128]; 
        int start = 0; 
        int maxLength = 0;  

        for (int end = 0; end < s.length(); end++) {
            start = Math.max(start, index[s.charAt(end)]);
            maxLength = Math.max(maxLength, end - start + 1);
            index[s.charAt(end)] = end + 1; 
        }

        return maxLength;

    }
}