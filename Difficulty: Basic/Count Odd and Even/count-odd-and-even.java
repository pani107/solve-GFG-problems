class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int a = 0;
        int b = 0;
        int c[] = new int[2];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                a++;
            }else {
                b++;
            }
            c[0] = b;
            c[1] = a;
         }
        return c;
    }
}