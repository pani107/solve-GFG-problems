class Solution {
    public int maxCharGap(String s) {
        // code here
        int maxGap = -1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    maxGap = Math.max(maxGap, j - i - 1);
                    break; 
                }
            }
        }

        return maxGap;
    }
};