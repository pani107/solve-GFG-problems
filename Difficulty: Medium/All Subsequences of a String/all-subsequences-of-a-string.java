class Solution {
    public List<String> powerSet(String s) {
        // Code here
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generate(0, s, sb, result);
        Collections.sort(result);
        return result;
    }
    static void generate(int idx,String s,StringBuilder sb ,  List<String> result) {
        if (idx == s.length()) {
            result.add(sb.toString());
            return;
        }
        sb.append(s.charAt(idx));
        generate(idx+1,s,sb,result);
        sb.deleteCharAt(sb.length()-1);       
        generate(idx+1,s,sb,result);
    }
}