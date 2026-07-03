class Solution {
    public String countryAtWar(List<Integer> arr1, List<Integer> arr2) {
        // code here
        int a = 0;
        int b = 0;
        for(int i = 0; i < arr1.size(); i++){
            if(arr1.get(i) > arr2.get(i))a++;    
            else if(arr1.get(i) < arr2.get(i)) b++;
            else continue;
        }
        if(a > b) return "A";
        else if(b > a) return "B";
        else return "DRAW";
    }
};