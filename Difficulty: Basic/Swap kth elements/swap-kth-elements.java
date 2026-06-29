
class Solution {
    public void swapKth(List<Integer> list, int k) {
        // code here
        int t = list.get(k-1);
        
        list.set(k-1, list.get(list.size()-k));
        list.set(list.size()-k, t);
    }
}
