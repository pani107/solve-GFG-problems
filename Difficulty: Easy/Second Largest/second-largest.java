class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int f = -1;
        int s = -1;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>f){
                s = f;
                f = arr[i];
            }
            else if(arr[i]<f && s < arr[i]){
                s = arr[i];
            }
        }
        if( s == -1){
            return -1;
        }
            
        return s;
    }
}