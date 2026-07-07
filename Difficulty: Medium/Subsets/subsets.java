class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        generate(0, arr, new ArrayList<>(), result);
        return result;
    }
    static void generate(int idx,int []nums,ArrayList<Integer>list , ArrayList<ArrayList<Integer>> result) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        generate(idx+1,nums,list,result);
        list.remove(list.size()-1);       
        generate(idx+1,nums,list,result);
        
    }
}