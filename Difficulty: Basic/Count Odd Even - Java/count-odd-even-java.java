/*Class solution with countOddEven() as its member function
 * arr : input array
 */
class Solution {
    public static void countOddEven(Integer arr[]) {

      
        int odd = 0;
        int even = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println(odd + " " + even);
    }
}
