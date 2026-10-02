
class Solution {
    public int maxSum(int[] arr, int k) {

        int sum = 0;

        // Step 1: Calculate the first window (k = 3 means indices 0, 1, 2)
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        // Step 2: Start i = k (index 3), the first element AFTER the first window
        for (int i = k; i < arr.length; i++) {

            // arr[i - k] = element leaving the window
            // arr[i]     = new element entering the window
            // k stays fixed; only i moves forward
            sum = sum - arr[i - k] + arr[i];

            // Keep the maximum window sum found so far
            max = Math.max(max, sum);
        }

        return max;
    }
}