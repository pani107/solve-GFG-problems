class Solution {
    static String delAlternate(String s) {
        // code here
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}