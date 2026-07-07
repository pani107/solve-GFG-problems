class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < target){
                list.add(arr[i]);
            }
        }
        return list;
    }
}