class Solution {
   final int MOD = (int)1e9 + 7;
    int minProduct(int arr[], int k) {
        // code here
         if (k > arr.length) {
            k = arr.length; 
        }
        Arrays.sort(arr);
        long multi = 1;
        for(int i = 0; i < k; i++){
           multi = (multi *arr[i]) % MOD;
        }
        return (int)multi;
    }
}
