class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // If lengths are different, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Count characters in s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        // Subtract characters using s2
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}