class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);

        int missing = 1;

        for (int num : arr) {
            if (num == missing) {
                missing++;
            }
        }

        return missing;
    }
}