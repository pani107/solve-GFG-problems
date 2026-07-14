class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        StringBuilder sb = new StringBuilder(s1 + s2);
        sb.reverse();
        return sb.toString();
    }
}