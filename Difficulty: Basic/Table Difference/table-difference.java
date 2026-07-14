class Solution {
    public static void difference(int n1, int n2) {

        // Write your code here
        
        int n = 1;
        while(n < 11){
            int num = (n1 * n) - (n2 * n);
            System.out.print(num +" ");
            n++;
        }
    }
}