class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            l.add(-1);
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            while (!stack.isEmpty() && stack.peek()>= arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                l.set(i, stack.peek());
            }
            stack.push(arr[i]);
        }
        return l;
    }
}