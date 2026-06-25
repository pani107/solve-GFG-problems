class Solution {
    int sumOfSeries(int n) {
        // code here
       int sum = 0;
        for (int i = 1; i <= n ; i++) {
            double cube = Math.pow(i, 3);
            sum += cube;
        }
       return sum;
    }
}