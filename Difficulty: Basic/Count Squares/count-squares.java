class Solution {
    static int countSquares(int n) {
        // code here
        long count = 0;
        for(int i = 1; i*i < n; i++){
           count++;
        }
        return (int)count;
    }
}