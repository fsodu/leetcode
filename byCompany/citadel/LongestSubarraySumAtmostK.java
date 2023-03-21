/**
 * #citadel 
 * https://www.geeksforgeeks.org/longest-subarray-sum-elements-atmost-k/
 * 
 * Given an array of integers, our goal is to find the length of the largest subarray having the sum of its elements at most ‘k’ where k>0.
Examples: 

Input : arr[] = {1, 2, 1, 0, 1, 1, 0}, k = 4
Output : 5
Explanation:
 {1, 2, 1} => sum = 4, length = 3
 {1, 2, 1, 0}, {2, 1, 0, 1} => sum = 4, length = 4
 {1, 0, 1, 1, 0} =>5 sum = 3, length = 5
*/

class LongestSubarraySumAtmostK {

    // sliding window 
    // ONLY WORKS WITH NON-NEGATIVE ARRAY!! 
    public static int longestSubarray(int[] arr, int k) {
        int cnt = 0; 
        int l = 0; 
        int sum = arr[0]; 
        for (int r = 1; r < arr.length; r++ ) {
            while (l < r && sum + arr[r] > k) {
                sum -= arr[l++]; 
            }
            sum += arr[r]; 
            cnt = Math.max(cnt, r - l + 1); 
        }
        return cnt; 
    }

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{5, 10, 7, 20, 57}, 22));
    }

}
